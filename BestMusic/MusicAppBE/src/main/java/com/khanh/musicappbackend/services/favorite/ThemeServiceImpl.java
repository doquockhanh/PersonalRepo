package com.khanh.musicappbackend.services.favorite;

import com.khanh.musicappbackend.models.Theme;
import com.khanh.musicappbackend.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService{
    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public List<Theme> getAll() {
        return themeRepository.findAll();
    }

    @Override
    public Theme findById(Integer id) {
        return themeRepository.findById(id).orElse(null);
    }

    @Override
    public void addTheme(Theme theme) {
        themeRepository.save(theme);
    }

    @Override
    public void delete(Integer id) {
        themeRepository.deleteById(id);
    }
}
