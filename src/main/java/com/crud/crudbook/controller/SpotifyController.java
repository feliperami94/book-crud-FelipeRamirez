package com.crud.crudbook.controller;

import com.crud.crudbook.entity.SpotifyAlbum;
import com.crud.crudbook.service.AlbumServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/spotifyAlbums")
public class SpotifyController {

    @Autowired
    private AlbumServiceInterface service;

    @GetMapping()
    public List<SpotifyAlbum> getAllAlbums(){
        return service.getAllAlbums();
    }

    @PostMapping()
    public SpotifyAlbum saveAlbum(@RequestBody SpotifyAlbum album){
        return service.saveAlbum(album);
    }

    @PutMapping()
    public SpotifyAlbum updateAlbum(@RequestBody SpotifyAlbum album){
        return service.updateAlbum(album);
    }

    @DeleteMapping("/{id}")
    public void deleteAlbum(@PathVariable Long id){
        service.deleteAlbum(id);
    }
}
