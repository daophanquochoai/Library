package com.quochoai.library.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String description;
    private Integer copies;
    private Integer copiesAvailable;
    private String category;
    private String img;

}
