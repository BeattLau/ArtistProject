package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class ArtistsImplementation implements Artists, Search{
    private Artist[] artists = new Artist[4]; // remember the references

    private int count;

    public void add(Artist artist) {
        artists[count++] = artist;
    }
    public Artist get(int index) {
        return artists[index];
    }
    @Override
    public List<Artist> search(String lastname) {
        List<Artist> results = new ArrayList<>();

    for (i=0; i<count; i++) {
        if (artists[i].getName().startsWith(lastname)){
                results.add(artists[i]);
            }
        }
    return results;
}
}
