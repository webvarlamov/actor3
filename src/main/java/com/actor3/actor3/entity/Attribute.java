package com.actor3.actor3.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Attribute {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    String id;
    String name;
    AttributeValueType attributeValueType;

    @OneToMany(cascade = { CascadeType.ALL }, mappedBy="attribute")
    List<AttributeValue> attributeValues;
}
