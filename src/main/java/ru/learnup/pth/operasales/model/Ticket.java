package ru.learnup.pth.operasales.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ticket {
    private int id;
    private int price;
    private String eventName;
}
