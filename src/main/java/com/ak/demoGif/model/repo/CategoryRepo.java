package com.ak.demoGif.model.repo;

import com.ak.demoGif.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepo {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(0, "sport"),
            new Category(0, "it")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
