package com.example.myapplication.api.responses;

public class FindIDResponse {
    private boolean success; // 요청 성공 여부
    private String message;  // 서버에서 전달된 메시지
    private String userId;   // 찾은 사용자 ID (성공 시)

    // Getter와 Setter 메서드
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
