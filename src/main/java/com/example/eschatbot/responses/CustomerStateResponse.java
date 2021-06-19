package com.example.eschatbot.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomerStateResponse {
    private Integer customerId;
    private Integer activeQues;
    private Integer activeJourney;
    private String phoneNumber;

    private String exceptionMessage;
}
