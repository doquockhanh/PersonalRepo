package com.musicapp.controllers;

import com.musicapp.models.Song;
import com.musicapp.services.favorite.ThemeService;
import com.musicapp.services.song.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SongController {
    @Autowired
    private SongService songService;
    @Autowired
    private ThemeService themeService;

    private List<Song> song;

    @GetMapping("/getAllSong")
    public ResponseEntity<List<Song>> getListSong(){
        song = songService.getAll();
        return new ResponseEntity<>(songService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getSongByKeyWord/{key}")
    public ResponseEntity<List<Song>> getListSongByKeyWord(@PathVariable String key){
        return new ResponseEntity<>(songService.getByKeyWord(key), HttpStatus.OK);
    }

    @PostMapping("/addSong")
    public void addSong(@RequestBody Song song){
        if(!songService.checkResource(song.getResource()) | song.getId() != null) {
            songService.addSong(song);
        }
    }

    @GetMapping("/getSongByTheme/{id}")
    public ResponseEntity<List<Song>> getListSongByTheme(@PathVariable Integer id){
        return new ResponseEntity<>(songService.getByTheme(themeService.findById(id)), HttpStatus.OK);
    }

    @DeleteMapping("/deleteSong/{id}")
    public void delete(@PathVariable Integer id){
        songService.deleteSong(id);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Song> getById(@PathVariable Integer id){
        return new ResponseEntity<>(songService.getById(id), HttpStatus.OK);
    }
}
