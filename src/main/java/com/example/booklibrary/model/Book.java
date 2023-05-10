package com.example.booklibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int bookId;
    private int bookOwnerId;
    private String bookName;
    private String bookAutor;
    private double costForSale;
}
