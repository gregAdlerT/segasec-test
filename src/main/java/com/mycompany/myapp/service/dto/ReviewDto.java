package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Greg Adler
 */
public class ReviewDto implements Serializable {
    String status;
    String copyright;
    int num_results;
    Result [] results;

    public ReviewDto() {
    }

    public ReviewDto(String status, String copyright, int num_results, Result[] results) {
        this.status = status;
        this.copyright = copyright;
        this.num_results = num_results;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ReviewDto{" +
            "status='" + status + '\'' +
            ", copyright='" + copyright + '\'' +
            ", num_results=" + num_results +
            ", results=" + Arrays.toString(results) +
            '}';
    }
}
