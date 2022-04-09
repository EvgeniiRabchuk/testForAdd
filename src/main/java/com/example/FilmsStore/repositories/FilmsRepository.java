package com.example.FilmsStore.repositories;

import com.example.FilmsStore.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends JpaRepository<Film,Long> {}
