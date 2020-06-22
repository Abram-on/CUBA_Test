package com.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|serialNum")
@Table(name = "TEST_METER")
@Entity(name = "test_Meter")
public class Meter extends StandardEntity {
    private static final long serialVersionUID = 1329777983869786932L;

    @NotNull(message = "Заполните серийный номер")
    @Column(name = "SERIAL_NUM", nullable = false, unique = true, length = 50)
    protected String serialNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected Users user;

    @Column(name = "CURRENT_INDICATION")
    protected Integer currentIndication;

    @NotNull
    @Column(name = "IS_USED", nullable = false, columnDefinition = "false")
    protected Boolean isUsed = false;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Integer getCurrentIndication() {
        return currentIndication;
    }

    public void setCurrentIndication(Integer currentIndication) {
        this.currentIndication = currentIndication;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
}