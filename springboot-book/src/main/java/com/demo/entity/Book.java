package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer id;
    private String bookname;
    private String author;
    private Double price;
    private Integer classid;
    private String descr;
    private String path;

    private Class cls;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", classid=" + classid +
                ", descr='" + descr + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
