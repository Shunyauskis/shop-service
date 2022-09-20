package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacteristicDTO {
    @Id
    private long id;
    private String customeValue;
    private CharacteristicSpecification characteristicSpecification;
    private CharacteristicSpecificationValue characteristicSpecificationValue;

}
