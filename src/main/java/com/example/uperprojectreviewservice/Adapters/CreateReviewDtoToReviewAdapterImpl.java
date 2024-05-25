package com.example.uperprojectreviewservice.Adapters;

import com.example.uperprojectreviewservice.Models.Booking;
import com.example.uperprojectreviewservice.Models.Review;
import com.example.uperprojectreviewservice.Repository.BookingRepository;
import com.example.uperprojectreviewservice.dto.CreateReviewDto;
import org.springframework.stereotype.Component;

import java.util.Optional;


/**
 * A class can handle the convert Dto to method
 */
@Component
public class CreateReviewDtoToReviewAdapterImpl implements createReviewDtotoReviewAdapter{

    private BookingRepository bookingRepository;

    public CreateReviewDtoToReviewAdapterImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    @Override
    public Review convertDto(CreateReviewDto createReviewDto) {
        Optional<Booking> booking = bookingRepository.findById(createReviewDto.getBookingId());
        return booking.map(value -> Review.builder()
                .rating(createReviewDto.getRating())
                .booking(value)
                .content(createReviewDto.getContent())
                .build()).orElse(null);
    }
}
