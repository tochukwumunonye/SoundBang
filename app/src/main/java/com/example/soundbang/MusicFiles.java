package com.example.soundbang;

public class MusicFiles {
    private String path;
    private String title;
    private String artiste;
    private String album;
    private String duration;
    private String id;

    public MusicFiles(String path, String title, String artiste, String album, String duration, String id) {
        this.path = path;
        this.title = title;
        this.artiste = artiste;
        this.album = album;
        this.duration = duration;
        this.id = id;
    }

    public MusicFiles() {
    }

    public String getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }

    public String getArtiste() {
        return artiste;
    }

    public String getAlbum() {
        return album;
    }

    public String getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
