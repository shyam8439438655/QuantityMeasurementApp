package com.bridgelabz.quantitymeasurement.dto;

import java.time.LocalDateTime;

public class QuantityMeasurementDTO {

    private Long id;
    private Long userId;
    private String userEmail;
    private Double thisValue;
    private String thisUnit;
    private String thisMeasurementType;

    private Double thatValue;
    private String thatUnit;
    private String thatMeasurementType;

    private String operation;
    private String resultString;
    private Double resultValue;
    private String resultUnit;
    private String resultMeasurementType;

    private String errorMessage;
    private boolean error;
    private LocalDateTime createdAt;

    public QuantityMeasurementDTO() {}

    // Getters
    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public String getUserEmail() { return userEmail; }
    public Double getThisValue() { return thisValue; }
    public String getThisUnit() { return thisUnit; }
    public String getThisMeasurementType() { return thisMeasurementType; }
    public Double getThatValue() { return thatValue; }
    public String getThatUnit() { return thatUnit; }
    public String getThatMeasurementType() { return thatMeasurementType; }
    public String getOperation() { return operation; }
    public String getResultString() { return resultString; }
    public Double getResultValue() { return resultValue; }
    public String getResultUnit() { return resultUnit; }
    public String getResultMeasurementType() { return resultMeasurementType; }
    public String getErrorMessage() { return errorMessage; }
    public boolean isError() { return error; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    // Setters (fixed to use this.field)
    public void setId(Long id) { this.id = id; }
    public void setUserId(Long userId) { this.userId = userId; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public void setThisValue(Double v) { this.thisValue = v; }
    public void setThisUnit(String u) { this.thisUnit = u; }
    public void setThisMeasurementType(String t) { this.thisMeasurementType = t; }
    public void setThatValue(Double v) { this.thatValue = v; }
    public void setThatUnit(String u) { this.thatUnit = u; }
    public void setThatMeasurementType(String t) { this.thatMeasurementType = t; }
    public void setOperation(String o) { this.operation = o; }
    public void setResultString(String s) { this.resultString = s; }
    public void setResultValue(Double v) { this.resultValue = v; }
    public void setResultUnit(String u) { this.resultUnit = u; }
    public void setResultMeasurementType(String t) { this.resultMeasurementType = t; }
    public void setErrorMessage(String m) { this.errorMessage = m; }
    public void setError(boolean e) { this.error = e; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    // Builder
    public static class Builder {
        private final QuantityMeasurementDTO dto = new QuantityMeasurementDTO();

        public Builder id(Long id) { dto.id = id; return this; }
        public Builder userId(Long userId) { dto.userId = userId; return this; }
        public Builder userEmail(String userEmail) { dto.userEmail = userEmail; return this; }
        public Builder thisValue(Double v) { dto.thisValue = v; return this; }
        public Builder thisUnit(String u) { dto.thisUnit = u; return this; }
        public Builder thisMeasurementType(String t) { dto.thisMeasurementType = t; return this; }
        public Builder thatValue(Double v) { dto.thatValue = v; return this; }
        public Builder thatUnit(String u) { dto.thatUnit = u; return this; }
        public Builder thatMeasurementType(String t) { dto.thatMeasurementType = t; return this; }
        public Builder operation(String o) { dto.operation = o; return this; }
        public Builder resultString(String s) { dto.resultString = s; return this; }
        public Builder resultValue(Double v) { dto.resultValue = v; return this; }
        public Builder resultUnit(String u) { dto.resultUnit = u; return this; }
        public Builder resultMeasurementType(String t) { dto.resultMeasurementType = t; return this; }
        public Builder errorMessage(String m) { dto.errorMessage = m; return this; }
        public Builder error(boolean e) { dto.error = e; return this; }
        public Builder createdAt(LocalDateTime createdAt) { dto.createdAt = createdAt; return this; }

        public QuantityMeasurementDTO build() { return dto; }
    }

    public static Builder builder() { return new Builder(); }
}
