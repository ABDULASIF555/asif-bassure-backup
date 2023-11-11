package com.bassure.invoiceservice.responsebody;

import java.util.Map;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Response<T> {

    private Integer statuscode;

    private T data;

    private String message;

    private Map<String, String> error;

}
