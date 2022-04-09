package com.example.FilmsStore.controllers;


import com.example.FilmsStore.models.Picture;
import com.example.FilmsStore.services.PicturesRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/picts")
@RequiredArgsConstructor
public class PicturesRestController {

    private final PicturesRepositoryService picturesRepositoryService;

    @GetMapping
    List<Picture> getPictures(@RequestParam Long filmId) {
        return picturesRepositoryService.getByFilmId(filmId);
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Long savePicture(@RequestParam Long filmId, @RequestPart MultipartFile pic) {
        return picturesRepositoryService.savePic(filmId, pic);
    }


}
