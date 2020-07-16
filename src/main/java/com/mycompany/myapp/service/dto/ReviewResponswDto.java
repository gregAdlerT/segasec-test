package com.mycompany.myapp.service.dto;

/**
 * @author Greg Adler
 */
public class ReviewResponswDto {
    String book;
    String review;

    public ReviewResponswDto(String book, String review) {
        this.book = book;
        this.review = review;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "ReviewResponswDto{" +
            "book='" + book + '\'' +
            ", review='" + review + '\'' +
            '}';
    }
}
