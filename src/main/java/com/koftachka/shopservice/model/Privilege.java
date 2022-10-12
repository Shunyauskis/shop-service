package com.koftachka.shopservice.model;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

public class Privilege {
    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection <Role> roles;
}
