package com.bassure.invoiceservice.responsebody;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Configuration
@ConfigurationProperties(prefix = "invoice.statuscode")
@Component
public class StatusCodeProperties {

    private Integer SUCCESS;
    private Integer FIELD_VALIDATE;
    private Integer SERVER_SEND_ERROR;
    private Integer GEOFENCING;
    private Integer USER_NOT_FOUND;
    private Integer TOKEN_UPDATE;
    private Integer TIME_OUT;
    private Integer NO_DATA;
    private Integer AUTHORIZE;
    private Integer WRONG_END_POINT;
    private Integer DUPLICATION;
    private Integer FAILED;
    private Integer SERVER_ERROR;
    private Integer NO_NETWORK_CONNECTION;

}
