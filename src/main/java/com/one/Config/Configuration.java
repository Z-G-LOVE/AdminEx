package com.one.Config;

import com.one.Interceptor.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @作者: one者天下
 * @时间: 2021/5/17 20:39
 * @描述: Springboot的自定义配置
 */
@org.springframework.context.annotation.Configuration // 声明该注解为配置类
public class Configuration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**","/w");
    }
}
