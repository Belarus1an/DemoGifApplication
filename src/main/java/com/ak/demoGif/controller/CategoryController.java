package com.ak.demoGif.controller;

import com.ak.demoGif.model.Category;
import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repo.CategoryRepo;
import com.ak.demoGif.model.repo.GifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
     private CategoryRepo categoryRepo;

    @Autowired
    private GifRepo gifRepo;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){

        List<Category> categoryList = categoryRepo.getAllCategories();

        modelMap.put("categories", categoryList);

        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String gifsCategory(@PathVariable int id, ModelMap modelMap){

        List<Gif> gifList = gifRepo.gitGifByCategory(id);

        Category category = categoryRepo.getCategoriesById(id);

        modelMap.put("gifs", gifList);
        modelMap.put("category", category);
        return "category";
    }
}
