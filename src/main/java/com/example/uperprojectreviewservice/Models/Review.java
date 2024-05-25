package com.example.uperprojectreviewservice.Models;

import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @Inheritance(strategy = InheritanceType.JOINED) specifies that the inheritance type is "joined", meaning that each class in the hierarchy (including the base class and its subclasses) will be mapped to its own database table.
 * This strategy uses primary key joins to represent the inheritance relationship between tables.
 *
 *
 */


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel  {

    @Column(nullable = false)
    private String content;

    private Double rating;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking; // we have defined a 1:1 relationship between booking and review

    @Override
    public String toString() {
        return "Review: " + this.content + " " + this.rating + " " + " booking: " + this.booking.getId() + " " + this.createdAt;
    }

}
