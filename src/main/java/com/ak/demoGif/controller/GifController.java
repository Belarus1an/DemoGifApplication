package com.ak.demoGif.controller;

import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repo.GifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GifController {

    @Autowired
     private GifRepo gifRepo;

    @RequestMapping("/showGifsInBrowser")
    @ResponseBody
    public String showGifsInBrowser(){

        return gifRepo.showNames();
    }

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){

        List<Gif> gifList = gifRepo.getAllGifs();

        modelMap.put("gifs", gifList);

        return "home";
    }

    @RequestMapping("/favorites")
    public String giftFavorite(ModelMap modelMap){

        List<Gif> gifListFavorite = gifRepo.getFavoritesGifs();

        modelMap.put("gifs", gifListFavorite);
        

        return "favorites";
    }
}
