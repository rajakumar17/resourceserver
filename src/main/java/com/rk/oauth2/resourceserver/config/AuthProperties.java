package com.rk.oauth2.resourceserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@Data
@ConfigurationProperties("auth")
public class AuthProperties {

  private JwtProperties jwt;

  @Data
  public static class JwtProperties {

    private Resource publicKey;

  }

}
