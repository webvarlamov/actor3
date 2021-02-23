package com.actor3.actor3.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
public class AttributeValue {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    String id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "ID")
    Attribute attribute;
    @ManyToOne
    @JoinColumn(referencedColumnName = "ID")
    ClientUser clientUser;

    String  valueString;
    long    valueLong;
    int     valueInt;
    boolean valueBoolean;
}
