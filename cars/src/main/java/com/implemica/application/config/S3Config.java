package com.implemica.application.config;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures the client to perform operations related to the service AWS S3.
 */
@Configuration
public class S3Config {
    /**
     * The region in which the bucket is registered.
     */
    @Value("${region}")
    private String region;

    /**
     * Defines s3 client with the required region and credentials.
     * @return customized s3 client
     */
    @Bean
    public AmazonS3 s3(){
        return AmazonS3ClientBuilder.standard()
               .withRegion(region)
               .build();
    }

}
