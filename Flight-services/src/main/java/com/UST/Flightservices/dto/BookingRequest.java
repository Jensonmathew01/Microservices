package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passengerinfo;
import com.UST.Flightservices.entity.Paymentinfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingRequest {
    private Passengerinfo passengerinfo;
    private Paymentinfo paymentinfo;


}
