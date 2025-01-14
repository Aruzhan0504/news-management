package org.example;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @PostMapping("/add")
    public ResponseEntity<News> addNews(@RequestBody NewsDto newsDto) {
        News savedNews = newsService.saveNews(newsDto);
        return ResponseEntity.ok(savedNews);
    }
}