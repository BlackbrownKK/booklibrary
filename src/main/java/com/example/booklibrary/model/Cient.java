package com.example.booklibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Cient {

    private int cientId;
    private String clientName;
    private String clientSurName;
    private double payment;
    private double creditPayment;

}
