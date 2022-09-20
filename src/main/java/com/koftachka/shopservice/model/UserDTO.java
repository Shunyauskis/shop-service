package com.koftachka.shopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @Id
    private long id;
    private String name;
    private String email;
    private String username;
    private String phone;
    private String password;
    private List<Role> role;

}
