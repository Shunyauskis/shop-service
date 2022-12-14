package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacteristicSpecification {
    @Id
    private long id;
    private String name;
    private List<CharacteristicSpecificationValue> characteristicSpecificationValue = new ArrayList<>();
}
