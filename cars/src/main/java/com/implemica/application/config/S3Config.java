package com.implemica.application.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
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
        AWSCredentials credentials = new BasicAWSCredentials(
            "AKIA4M6UWAPSGCAIVUXH",
            "me3at0oA7Y+s40iy/eoRxVe/2p3cjJ/FybU+7pEv"
        );
        return AmazonS3ClientBuilder.standard()
               .withCredentials(new AWSStaticCredentialsProvider(credentials))
               .withRegion(region)
               .build();
    }

}
