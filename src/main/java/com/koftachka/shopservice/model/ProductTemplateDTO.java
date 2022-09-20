package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductTemplateDTO {
    @Id
    private long id;
    private ProductDto product;
    private List<ChargeDTO> charge;
    private List<DiscountDTO> discountDTO;

}
