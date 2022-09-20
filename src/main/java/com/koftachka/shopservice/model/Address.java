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
public class Address {
    @Id
    private long id;
    private String name;
    private String country;
    private String city;
    private String street;
    private String apartment;
    @ManyToMany
    private List<OrderDTO> orderDTO;
}
