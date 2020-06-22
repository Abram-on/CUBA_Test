package com.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|firstName")
@Table(name = "TEST_USERS")
@Entity(name = "test_Users")
public class Users extends StandardEntity {
    private static final long serialVersionUID = -2925432640601734788L;

    @NotNull(message = "{msg://test_Users.firstName.validation.NotNull}")
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull(message = "Фамилия должна быть заполнена")
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @NotNull(message = "ИНН не может быть  пустым")
    @Column(name = "INN", nullable = false, unique = true)
    protected String iNN;

    public String getINN() {
        return iNN;
    }

    public void setINN(String iNN) {
        this.iNN = iNN;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}