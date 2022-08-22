package com.oracle.pojo.vo;

/**
 * @author ltcstart
 * @date 2022/8/19 - 19:21
 */
public class SearchBean {
    private String title;
    private String author;
    private String category;

    public SearchBean() {
    }

    public SearchBean(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SearchBean{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
