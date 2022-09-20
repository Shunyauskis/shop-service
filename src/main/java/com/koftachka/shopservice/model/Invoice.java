package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    private long id;
    private BigDecimal totalPrice;
    private List<OrderEntity> invoiceItem;

}
