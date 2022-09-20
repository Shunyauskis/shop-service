package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChargeDTO {
    @Id
    private long id;
    private ChargeType chargeType;
    private String name;
    private List<DiscountDTO> discount;

}
