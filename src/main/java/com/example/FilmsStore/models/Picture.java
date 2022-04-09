package com.example.FilmsStore.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    public Picture(Long filmId, byte[] file) {
        this.filmId = filmId;
        this.file = file;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long filmId;

    @Lob
    private byte[] file;
}
