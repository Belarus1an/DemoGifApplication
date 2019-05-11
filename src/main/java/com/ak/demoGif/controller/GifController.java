package com.ak.demoGif.controller;

import com.ak.demoGif.model.repo.GifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @Autowired
    GifRepo gifRepo;

    @RequestMapping("/showGifsInBrowser")
    @ResponseBody
    public String showGifsInBrowser(){

        return gifRepo.showNames();
    }
}
