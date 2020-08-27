package com.khanh.musicappbackend.services.favorite;

import com.khanh.musicappbackend.models.Theme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ThemeService {
    List<Theme> getAll();
    Theme findById(Integer id);
    void addTheme(Theme theme);
    void delete(Integer id);
}
