package com.actor3.actor3.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ClientUser {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    String id;
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="clientUser")
    List<AttributeValue> attributeValues;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "USER_ID")
    User user;
    String description;

    @Override
    public String toString() {
        return "ClientUser{" +
                "id='" + id + '\'' +
                ", attributeValues=" + attributeValues +
                ", description='" + description + '\'' +
                '}';
    }
}
