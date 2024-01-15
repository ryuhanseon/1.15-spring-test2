package com.example.test2;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> list(){
        return this.articleRepository.findAll();
    }
    public Article detail(Integer id){
        Optional<Article> article = this.articleRepository.findById(id);
       return article.get();

    }


}
