package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    private long id;
    private PaymentType paymentType;
    private Invoice invoice;
    private int amount;
    private Currency currency;
}
