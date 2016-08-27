package com.petmatch.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Owner")
public class Person {
@Id @GeneratedValue
private int ownerId;
private String name;

}
