package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LedgerAccount {
    @Id
    private long id;
    private String name;
    private List<OrderDTO> order;
    private List<Invoice> invoice;
    private List<Payment> payment;

}
