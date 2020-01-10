package com.klezovich.aws;

import com.klezovich.aws.config.AwsConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AwsApplicationTests {

    @Autowired
    AwsConfig awsConfig;

    @Test
    void contextLoads() {
    }

    @Test
    void testValidAwsConfig() {
        assertEquals("AKIA5QBSTNDBK7NOEH5D",awsConfig.getKey());
        assertEquals("z9Wl/rOub6bMSpSPCf+f0jqGSwzziO0BzuCXHc2o",awsConfig.getSecret());
    }
}
