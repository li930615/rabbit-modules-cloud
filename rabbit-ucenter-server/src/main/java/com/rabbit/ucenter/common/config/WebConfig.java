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

    /**/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 加载static文件夹下的静态资源
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        //
        registry.addResourceHandler("/templates/**")
                .addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/templates/");
        // 实例化一个配置文件对象
        File path = null;
        try {
            // 根据配置文件路径获取配置文件
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException fileNotFound) {
            fileNotFound.printStackTrace();
        }
        // 获取配置文件的绝对路径
        String absolutePath = path.getAbsolutePath();
        // jar包启动
        String upload = null;
        if (absolutePath.contains(ResourceUtils.CLASSPATH_URL_PREFIX)) {
            upload = path.getParentFile().getParentFile().getParent() + "/upload/";
        } else {
            upload = ResourceUtils.CLASSPATH_URL_PREFIX + "/upload/";
        }
        registry.addResourceHandler("/upload/**").addResourceLocations(upload);
        //
        super.addResourceHandlers(registry);
    }

    /**
     * 自定义拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截规则：除了rpc，其它都拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/static/login/**");
        super.addInterceptors(registry);
    }

    /**
     * 处理中文乱码:之前使用SSM配置文件配置时用过很多次的消息头转换
     */
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter(Charset.forName("utf-8"));
    }

    /**
     *
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }

    /**
     * ContentNegotiationManager继承自ContentNegotiationStrategy，同时其内部又含有多个ContentNegotiationStrategy实例，使用了策略模式和组合模式的思想。在从一个Request请求中解析返回数据格式时，自身没有解析逻辑，而是调用其内部持有的ContentNegotiationStrategy集合来循环解析，而这个集合就是我们刚开始配置时生成的策略。
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurers) {
        configurers.favorPathExtension(false);
    }

    /**
     * RestTemplate 注入，SpringBoot调用接口
     */
    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory) {
        return new RestTemplate(factory);
    }

    /**
     *
     */
    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        //
        factory.setReadTimeout(5000);
        //
        factory.setConnectTimeout(15000);
        return factory;
    }
}
