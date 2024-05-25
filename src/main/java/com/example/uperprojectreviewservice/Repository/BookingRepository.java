package com.example.uperprojectreviewservice.Repository;

import com.example.uperprojectreviewservice.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>
{

}
