package com.example.uperprojectreviewservice.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel
{
    @Id // this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means auto_increment
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the formats of Date object to be stored i.e. Date / Time ? Timestamp
    @CreatedDate // this annotation tells spring that only handle it for object creation
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate  // this annotation tells spring that only handle it for object update
    protected Date updatedAt;

}

/**
 * Documentation
 *
 * The BaseModel class serves as a base class for other entity classes in a Spring Data JPA application. It centralizes common properties and behavior, particularly those related to entity lifecycle management and auditing, so that they can be inherited by other entities. Here’s a detailed breakdown of the purpose and components of this class:
 *
 * Purpose of BaseModel
 * Code Reusability:
 *
 * Standardization: It standardizes the primary key generation and timestamp handling across all entity classes that extend it, ensuring consistency in how these aspects are managed.
 *
 * @EntityListeners(AuditingEntityListener.class)
 * Registers the AuditingEntityListener to handle auditing events such as setting the createdAt and updatedAt fields automatically.
 *
 * MappedSuperclass
 *
 * Indicates that this class is a base class for JPA entities. It’s not a complete entity itself and will not be mapped to a database table. Instead, its properties are inherited by subclasses that are entities.
 *
 * @Temporal(TemporalType.TIMESTAMP) specifies that the createdAt field should be stored with both date and time information.
 */