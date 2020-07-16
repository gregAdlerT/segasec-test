package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Greg Adler
 */
public class Result implements Serializable {
    String url;
    String publication_dt;
    String byline;
    String book_title;
    String book_author;
    String summary;
    String [] isbn13;

    public Result() {
    }

    public Result(String url, String publication_dt, String byline, String book_title, String book_author, String summary, String[] isbn13) {
        this.url = url;
        this.publication_dt = publication_dt;
        this.byline = byline;
        this.book_title = book_title;
        this.book_author = book_author;
        this.summary = summary;
        this.isbn13 = isbn13;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublication_dt() {
        return publication_dt;
    }

    public void setPublication_dt(String publication_dt) {
        this.publication_dt = publication_dt;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String[] getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String[] isbn13) {
        this.isbn13 = isbn13;
    }

    @Override
    public String toString() {
        return "Result{" +
            "url='" + url + '\'' +
            ", publication_dt='" + publication_dt + '\'' +
            ", byline='" + byline + '\'' +
            ", book_title='" + book_title + '\'' +
            ", book_author='" + book_author + '\'' +
            ", summary='" + summary + '\'' +
            ", isbn13=" + Arrays.toString(isbn13) +
            '}';
    }
}
