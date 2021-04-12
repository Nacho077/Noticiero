package com.henry.noticas.model;

import java.io.Serializable;
import java.util.List;

public class PaginationResponse<T> implements Serializable {

    private List<T> content;
    private int totalPages;
    private Long totalElements;

    public PaginationResponse(List<T> content, int totalPages, long totalElements) {
        this.content = content;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}
