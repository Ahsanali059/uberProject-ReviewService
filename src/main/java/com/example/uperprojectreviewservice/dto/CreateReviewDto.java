package com.example.uperprojectreviewservice.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Create Review data Transfer Object
 */
@Getter
@Setter
public class CreateReviewDto
{
    private String content;
    private Double rating;
    private Long bookingId;

}
