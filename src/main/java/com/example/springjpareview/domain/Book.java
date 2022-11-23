package com.example.springjpareview.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Book2")
public class Book {
    @Id
    private Long id;
    private String name;
    private Long authorId;
}