package com.mastercard.labs.sng.qrscantester.api;

import com.mastercard.labs.sng.qrscantester.api.request.PaymentRequest;
import com.mastercard.labs.sng.qrscantester.api.response.PaymentResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/merchantTransferFundingAndPayment")
    Call<PaymentResponse> makePayment(@Body PaymentRequest request);

}
