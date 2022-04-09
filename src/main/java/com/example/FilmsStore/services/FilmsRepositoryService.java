package com.example.FilmsStore.services;

import com.example.FilmsStore.models.Film;
import com.example.FilmsStore.repositories.FilmsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmsRepositoryService {
    private final FilmsRepository filmsRepository;

    public Film saveFilm(Film film) {
        return filmsRepository.save(film);
    }

    public Film changeFilm(Film film) {
        if (filmsRepository.existsById(film.getId())) {
            return filmsRepository.save(film);
        } else {
            throw new RuntimeException("Film to change not found");
        }
    }

    public void deleteFilm(Long id) {
        if (filmsRepository.existsById(id)) {
            filmsRepository.deleteById(id);
        } else {
            throw new RuntimeException();
        }
    }

    public Optional<Film> getFilm(Long id) {
        return filmsRepository.findById(id);
    }

    public List<Film> getAllFilms() {
        return filmsRepository.findAll();
    }

    public void deleteAllFilms() {
        filmsRepository.deleteAll();
    }

    public boolean exist(Long id) {
        return filmsRepository.existsById(id);
    }


}
