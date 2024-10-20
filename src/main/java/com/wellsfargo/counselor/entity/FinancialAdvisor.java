package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String name;
    private String email;
    private String phoneNumber;

    public FinancialAdvisor(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public FinancialAdvisor() {}

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancialAdvisor that = (FinancialAdvisor) o;
        return Objects.equals(advisorId, that.advisorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advisorId);
    }
}
