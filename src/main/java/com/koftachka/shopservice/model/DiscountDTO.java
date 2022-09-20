package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDTO {
    @Id
    private long id;
    private String name;
    private int amount;
    private Currency currency;
}
