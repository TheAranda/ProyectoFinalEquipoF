package com.Egg.Inmobiliaria.models;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import com.Egg.Inmobiliaria.enums.OfferStatus;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @ManyToOne
    private Property property;
    @ManyToOne
    private User user;
    private Double price;
    private OfferStatus offerStatus;

    public Offer() {
    }    

    public Offer(Long id, Date creationDate, Property property, User user, Double price, OfferStatus offerStatus) {
        this.id = id;
        this.creationDate = creationDate;
        this.property = property;
        this.user = user;
        this.price = price;
        this.offerStatus = offerStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OfferStatus getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(OfferStatus offerStatus) {
        this.offerStatus = offerStatus;
    } 
    
}