package com.rabbit.ucenter.common.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * 〈web配置类:>
 * <1>加载静态资源</>
 * <2>response消息格式转换</>
 * <3>定义请求拦截规则
 *
 * @author lzq
 * @date 2019/1/17 22:51
 **/
@Configuration
@ComponentScan //开启组件扫描：交由Spring容器管理
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /*调用父类的构造方法*/
    public WebConfig() {
        super();
    }

    @Override
    /*设置应用上下文环境*/
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    /*注册静态资源文件:从源码得知在WebConfig加载的时候调用这个构造方法，将这个资源处理器加载到容器中管理*/
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/templates/");
        super.addResourceHandlers(registry);
    }

    @Override
    /*注册拦截器*/
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截规则：除了rpc，其他都拦截判断(exclude:排除、排斥的意思)
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/rpc/**");
        super.addInterceptors(registry);
    }

    /*处理中文乱码*/
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        /*设置响应的字符编码为utf-8*/
        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }

    @Override
    /*restful服务中一个重要的特性就是一种资源可以有多种表现形式，在springmvc中可以使用ContentNegotiatingViewResolver这个视图解析器来实现这种方式。*/
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }
}
