package com.example.FilmsStore.controllers;

import com.example.FilmsStore.models.Film;
import com.example.FilmsStore.services.FilmsRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmsRestController {

    private final FilmsRepositoryService filmsRepositoryService;

    @PostMapping
    Film saveFilm(@RequestBody Film film) {
        return filmsRepositoryService.saveFilm(film);
    }

    @GetMapping
    Film getFilm(@RequestParam Long id) {
        return filmsRepositoryService.getFilm(id).orElseThrow();
    }

    @PutMapping
    Film updateFilm(@RequestBody Film film) {
        return filmsRepositoryService.changeFilm(film);
    }

    @DeleteMapping
    void deleteFilm(@RequestParam Long id) {
        filmsRepositoryService.deleteFilm(id);
    }

    @GetMapping("/all")
    List<Film> getAllFilms() {
        return filmsRepositoryService.getAllFilms();
    }

    @DeleteMapping("/all")
    void deleteAllFilms() {
        filmsRepositoryService.deleteAllFilms();
    }
}
