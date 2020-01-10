package com.klezovich.aws.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("aws")
@Configuration
public class AwsConfig {

    private String key;
    private String secret;

    @Bean
    public AWSCredentials getAwsCredentials() {
        return new BasicAWSCredentials(key,secret);
    }
}
