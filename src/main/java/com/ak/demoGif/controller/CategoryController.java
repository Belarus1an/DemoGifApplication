package com.ak.demoGif.controller;

import com.ak.demoGif.model.Category;
import com.ak.demoGif.model.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
     private CategoryRepo categoryRepo;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){

        List<Category> categoryList = categoryRepo.getAllCategories();

        modelMap.put("categories", categoryList);

        return "categories";
    }
}
