package com.khanh.musicappbackend.repository;

import com.khanh.musicappbackend.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme, Integer> {
}
