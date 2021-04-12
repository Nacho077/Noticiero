package com.henry.noticas.model;

import java.io.Serializable;
import java.util.List;

public class PaginationResponse<T> implements Serializable {

    private List<T> response;
    private int paginas;
    private Long elementos;
}
