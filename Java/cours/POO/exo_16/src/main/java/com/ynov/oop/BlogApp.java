package com.ynov.oop;

import java.util.ArrayList;
import java.util.List;

class BlogApp {
    private List<Article> articles;

    public BlogApp() {
        articles = new ArrayList<>();
    }

    public void createArticle(String title, String content) {
        Article article = new Article(title, content);
        articles.add(article);
    }

    public void createVideoArticle(String title, String content, String videoUrl) {
        VideoArticle videoArticle = new VideoArticle(title, content, videoUrl);
        articles.add(videoArticle);
    }

    public void displayArticles() {
        for (Article article : articles) {
            System.out.println(article.toHtml() + "\n");
        }
    }

    public List<Article> filterArticlesByTitle(String keyword) {
        List<Article> filteredArticles = new ArrayList<>();
        for (Article article : articles) {
            if (article.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                filteredArticles.add(article);
            }
        }
        return filteredArticles;
    }
}
