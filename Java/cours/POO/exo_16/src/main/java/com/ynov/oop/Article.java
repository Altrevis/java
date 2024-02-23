package com.ynov.oop;

class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String toHtml() {
        return "<h2>" + title + "</h2>\n<p>" + content + "</p>";
    }
}
