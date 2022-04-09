package com.example.FilmsStore.services;

import com.example.FilmsStore.models.Picture;
import com.example.FilmsStore.repositories.PicturesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PicturesRepositoryService {

    private final PicturesRepository picturesRepository;
    private final FilmsRepositoryService filmsRepositoryService;

    public Long savePic(Long filmId, MultipartFile pic) {
        if (filmsRepositoryService.exist(filmId)) {
            try {
                byte[] arr = pic.getBytes();
                return picturesRepository.save(new Picture(filmId, arr)).getId();
            } catch (IOException e) {
                throw new RuntimeException("Error during saving file");
            }
        } else {
            throw new RuntimeException("No such film");
        }
    }

    public List<Picture> getByFilmId(Long id) {
        return picturesRepository.getAllByFilmId(id);
    }

}
