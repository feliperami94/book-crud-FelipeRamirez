package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "SpotifyAlbums")
@Table(name = "spotifyCatalogue")
@Data
public class SpotifyAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String albumTitle;

    private String artistName;

    private Integer songsNumber;

    private String musicGenre;
}
