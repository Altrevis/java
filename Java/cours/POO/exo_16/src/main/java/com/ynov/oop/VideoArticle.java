package com.ynov.oop;

class VideoArticle extends Article {
    private String videoUrl;

    public VideoArticle(String title, String content, String videoUrl) {
        super(title, content);
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    @Override
    public String toHtml() {
        return super.toHtml() + "\n<iframe width='560' height='315' src='" + videoUrl + "' frameborder='0' allowfullscreen></iframe>";
    }
}
