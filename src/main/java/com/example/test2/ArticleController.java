package com.example.test2;


import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/list")

    public String articleList(Model model){
        List<Article> articleList = this.articleService.list();
        model.addAttribute("articleList", articleList);
        return "article_list";
    }
    @GetMapping(value = "/detail/{id}")
    public String articleDetail(@PathVariable("id")Integer id, Model model){
        Article article = new Article();
        model.addAttribute("article", article);
        return "article_detail";
    }


    @GetMapping("/create")
    public String articleCreate(){
        return "article_create";
    }

}
