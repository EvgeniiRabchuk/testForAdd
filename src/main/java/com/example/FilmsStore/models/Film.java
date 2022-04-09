package com.example.FilmsStore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    public Film(String title, Long votes, LocalDate release, Integer stars) {
        this.title = title;
        this.votes = votes;
        this.release = release;
        this.stars = stars;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Long votes;

    private LocalDate release;

    private Integer stars;

}
