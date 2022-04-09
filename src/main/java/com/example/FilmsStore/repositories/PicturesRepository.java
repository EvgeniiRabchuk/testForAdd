package com.example.FilmsStore.repositories;

import com.example.FilmsStore.models.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PicturesRepository extends JpaRepository<Picture, Long> {

    List<Picture> getAllByFilmId(Long id);

}
