package com.ak.demoGif.controller;

import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repo.GifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @ResponseBody
    public String listGifs(){

        List<Gif> gifList = gifRepo.getAllGifs();

        return gifList.toString();
    }
}
