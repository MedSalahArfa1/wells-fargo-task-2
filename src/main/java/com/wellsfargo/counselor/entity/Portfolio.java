package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Portfolio(Client client) {
        this.client = client;
    }

    public Portfolio() {}

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portfolio portfolio = (Portfolio) o;
        return Objects.equals(portfolioId, portfolio.portfolioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portfolioId);
    }
}
