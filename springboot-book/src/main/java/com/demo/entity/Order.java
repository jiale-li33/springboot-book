package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private String cusid;
    private String bookid;
    private Integer num;

    private Book book;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cusid='" + cusid + '\'' +
                ", bookid='" + bookid + '\'' +
                ", num=" + num +
                ", book=" + book +
                '}';
    }
}
