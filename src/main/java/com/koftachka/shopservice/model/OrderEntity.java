package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    private long id;
    private String name;
    private double price;
    private Currency currency;
    private ProductTemplateDTO productTemplate;
}
