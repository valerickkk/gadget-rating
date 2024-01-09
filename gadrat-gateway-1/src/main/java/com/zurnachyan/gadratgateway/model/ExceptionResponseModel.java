package com.zurnachyan.gadratgateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponseModel {

    private String errorCode;

    private String error;

    private String errorDetails;

    private Date errodDate;
}
