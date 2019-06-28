package com.shf.jwt.config;

import com.shf.jwt.utils.VerifyCodeFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * 描述：验证码servlet配置项
 *
 * @Author shf
 * @Date 2019/4/21 18:05
 * @Version V1.0
 **/
//@Configuration
public class VerifyCodeServletConfig {
    @Bean
    public ServletRegistrationBean indexServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new VerifyCodeFactory());
        registration.addUrlMappings("/getVerifyCode");
        return registration;
    }
}
