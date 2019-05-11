package com.ak.demoGif.model.repo;

import com.ak.demoGif.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepo {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion.gif", "mols", true),
            new Gif("ben-and-mike.gif", "mika", true),
            new Gif("book-dominos.gif", "mem", true),
            new Gif("compiler-bot.gif", "bot", true),
            new Gif("cowboy-coder.gif", "code", true),
            new Gif("infinite-andrew.gif", "andrew", true)
    );

    public String showNames(){

        String name = "";

        for (int i = 0; i < ALL_GIFS.size(); i++) {
            name += ALL_GIFS.get(i).getName() + " ";
        }

        return name;
    }


}
