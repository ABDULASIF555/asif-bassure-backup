package com.bassure.invoiceservice.responsebody;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Configuration
@ConfigurationProperties(prefix = "invoice.message")
@EnableConfigurationProperties
@Component
public class MessageProperties {

    private String SUCCESS_MESSAGE;
    private String SERVER_ERROR_MESSAGE;
    private String FIELD_VALIDATE_MESSAGE;
    private String NO_DATA_MESSAGE;
}
