package com.example.uperprojectreviewservice.Adapters;

import com.example.uperprojectreviewservice.Models.Review;
import com.example.uperprojectreviewservice.dto.CreateReviewDto;


/**
 * The interface createReviewDtotoReviewAdapter serves as a design pattern commonly known as the Adapter Pattern. This pattern is used to convert the interface of a class into another interface that a client expects. Here’s an explanation of why and how it is used in the given context:
 *
 * Why Use This Adapter Interface
 * Separation of Concerns: The adapter pattern separates the concerns of data transfer and domain logic. CreateReviewDto is likely a Data Transfer Object (DTO) that carries data between processes, whereas Review represents a domain model. The conversion logic is encapsulated in the adapter, keeping the DTO and domain model independent of each other.
 */
public interface createReviewDtotoReviewAdapter
{
    public Review convertDto(CreateReviewDto createReviewDto);
}
