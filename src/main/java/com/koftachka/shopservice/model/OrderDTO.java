package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    @Id
    private long id;
    private Invoice invoice;
    private Payment payment;
    @ManyToMany
    private List<Address> address;
    private Status status;
}
