package com.khanh.musicappbackend.controllers;

import com.khanh.musicappbackend.models.Theme;
import com.khanh.musicappbackend.services.favorite.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ThemeController {
    @Autowired
    private ThemeService themeService;

    @GetMapping("/allTheme")
    public ResponseEntity<List<Theme>> allTheme(){
        return new  ResponseEntity<>(themeService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/addTheme")
    public void addTheme(@RequestBody Theme theme){
        themeService.addTheme(theme);
    }

    @DeleteMapping("/deleteTheme/{id}")
    public void deleteTheme(@PathVariable Integer id){
        themeService.delete(id);
    }
}
