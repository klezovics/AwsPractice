package com.klezovich.aws.s3;

import com.amazonaws.services.s3.AmazonS3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class S3ClientConfigTest {

    @Autowired
    private AmazonS3 s3client;

    @Test
    public void testCanSeeBuckets() {
        assertThat(s3client.listBuckets().size(), greaterThan(0));
    }
}