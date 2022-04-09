package com.example.FilmsStore.services;

import com.example.FilmsStore.models.Film;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class TestDataInsertService implements CommandLineRunner {

    private final FilmsRepositoryService filmsRepositoryService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Begin of input test data...");

        System.out.println(filmsRepositoryService.saveFilm(new Film("ABC", 80l, LocalDate.now(), 5)));
        System.out.println(filmsRepositoryService.saveFilm(new Film("CDE", 90l, LocalDate.now(), 6)));
        System.out.println(filmsRepositoryService.saveFilm(new Film("DEF", 100l, LocalDate.now(), 7)));

        System.out.println("End of tests data insertion.");
    }
}
