package com.example.myapplication.api;

import com.example.myapplication.api.requests.CheckIDRequest;
import com.example.myapplication.api.responses.CheckIDResponse;
import com.example.myapplication.api.requests.SignUpRequest;
import com.example.myapplication.api.responses.SignUpResponse;
import com.example.myapplication.api.requests.VerificationRequest;
import com.example.myapplication.api.responses.VerificationResponse;
import com.example.myapplication.api.requests.LoginRequest;
import com.example.myapplication.api.responses.LoginResponse;
import com.example.myapplication.api.requests.FindIDRequest;
import com.example.myapplication.api.responses.FindIDResponse;
import com.example.myapplication.api.requests.FindPasswordRequest;
import com.example.myapplication.api.responses.FindPasswordResponse;
import com.example.myapplication.api.requests.ChangePasswordRequest;
import com.example.myapplication.api.responses.ChangePasswordResponse;
import com.example.myapplication.api.requests.RecommendRequest;
import com.example.myapplication.api.responses.RecommendResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/send-verification-code")
    Call<VerificationResponse> sendVerificationCode(@Body VerificationRequest request);

    @POST("/api/login")
    Call<LoginResponse> login(@Body LoginRequest request);

    @POST("/api/check-id")
    Call<CheckIDResponse> checkID(@Body CheckIDRequest request);

    @POST("/api/sign-up")
    Call<SignUpResponse> signUp(@Body SignUpRequest request);

    @POST("/api/send-verification-code/id")
    Call<Void> sendIDVerificationCode(@Body FindIDRequest request);

    @POST("/api/find-id")
    Call<FindIDResponse> findID(@Body FindIDRequest request);

    @POST("/api/send-verification-code/password")
    Call<Void> sendPasswordVerificationCode(@Body FindPasswordRequest request);

    @POST("/api/reset-password")
    Call<FindPasswordResponse> resetPassword(@Body FindPasswordRequest request);

    @POST("/api/change-password")
    Call<ChangePasswordResponse> changePassword(@Body ChangePasswordRequest request);

    @POST("/api/recommend") // 서버의 추천 API 엔드포인트
    Call<RecommendResponse> getRecommendations(@Body RecommendRequest request);

}
