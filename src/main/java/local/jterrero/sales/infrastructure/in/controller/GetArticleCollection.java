package local.jterrero.sales.infrastructure.in.controller;

import local.jterrero.sales.infrastructure.in.ArticleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public final class GetArticleCollection {

    @GetMapping("/api/v1/articles")
    public ResponseEntity<List<ArticleDTO>> handle()
    {
        return ResponseEntity.ok(Arrays.asList(
            ArticleDTO.of("Andres"),
            ArticleDTO.of("Alvaro"),
            ArticleDTO.of("Joserra")
        ));
    }
}
