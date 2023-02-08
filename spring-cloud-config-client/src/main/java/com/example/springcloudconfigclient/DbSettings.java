package com.example.springcloudconfigclient;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
@Getter
@Setter
public class DbSettings {
    private String connection;
    private String host;
    private int port;
}
