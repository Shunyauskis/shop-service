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
public class CustomerDTO {
    @Id
    private long id;
    private UserDTO user;
    private String name;
    private String sirName;
    private String middleName;
    @ManyToMany
    private List<Address> address;
    private List<LedgerAccount> ledgerAccount;
    private Cart cart;
    private WishList wishList;
}
