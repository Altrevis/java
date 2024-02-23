package com.ynov.oop;

import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        BlogApp blogApp = new BlogApp();

        blogApp.createArticle("Article Simple 1", "Contenu de l'article simple 1");
        blogApp.createVideoArticle("Vidéo Article 1", "Contenu de la vidéo article 1", "https://www.youtube.com/embed/VIDEO_ID");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le mot-clé pour filtrer les articles par titre: ");
        String keyword = scanner.nextLine();

        List<Article> filteredArticles = blogApp.filterArticlesByTitle(keyword);

        if (filteredArticles.isEmpty()) {
            System.out.println("Aucun article trouvé avec le mot-clé: " + keyword);
        } else {
            System.out.println("Articles trouvés:");
            for (Article article : filteredArticles) {
                System.out.println(article.toHtml() + "\n");
            }
        }
    }
}
