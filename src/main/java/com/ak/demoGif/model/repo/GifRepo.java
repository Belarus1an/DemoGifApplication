package com.ak.demoGif.model.repo;

import com.ak.demoGif.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepo {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif(0,"android-explosion", "mols", true),
            new Gif(1,"ben-and-mike", "mika", false),
            new Gif(1,"book-dominos", "mem", true),
            new Gif(2,"compiler-bot", "bot", false),
            new Gif(0,"cowboy-coder", "code", false),
            new Gif(1,"infinite-andrew", "andrew", false)
    );

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> getFavoritesGifs(){

        List<Gif> gifList = new ArrayList<>();

        for (Gif value: ALL_GIFS){
            if (value.getFavorite()){
                gifList.add(value);
            }
        }
        return gifList;
    }

    public String showNames(){

        String name = "";

        for (int i = 0; i < ALL_GIFS.size(); i++) {
            name += ALL_GIFS.get(i).getName() + " ";
        }

        return name;
    }

    public List<Gif> gitGifByCategory(int id){

        List<Gif> gifList = new ArrayList<>();

        for (Gif value: ALL_GIFS){
            if (id == value.getCategoriesId()){
                gifList.add(value);
            }
        }
        return gifList;
    }


}
