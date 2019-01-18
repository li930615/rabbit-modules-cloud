package com.rabbit.ucenter.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * #_自定义拦截器
 * 〈拦截器是在面向切面编程中应用的，就是在你的service或者一个方法前调用一个方法，
 * 或者在方法后调用一个方法。是基于JAVA的反射机制。拦截器不是在web.xml，比如struts在struts.xml中配置。
 * 拦截器，在AOP(Aspect-Oriented Programming)中用于在某个方法或字段被访问之前，进行拦截，然后在之前或
 * 之后加入某些操作。拦截是AOP的一种实现策略〉
 *
 * @author lzq
 * @date 2019/1/17 22:51
 **/
public class MyInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    /*预处理拦截器：该方法将在请求处理之前进行调用*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //根据请求的安全性来判断请求属于带证书(https)请求，还是不带证书的(http)请求
        String portocol = request.isSecure() ? "https://" : "http://";
        //从request中拿出服务名(IP)和端口号（eg:localhost:8080）
        String serverNamePort = portocol + request.getServerName() + ":" + request.getServerPort();
        //获取完整的项目路径放入request中
        request.setAttribute("basePath", serverNamePort + request.getContextPath());
        //微服务网关是介于客户端和服务器端之间的中间层，所有的外部请求都会先经过微服务网关。这样客户端只需要和网关交互，而无需直
        //接调用特定微服务的接口，而且方便监控，易于认证，减少客户端和各个微服务之间的交互次数
        request.setAttribute("zuulBasePath", serverNamePort + "/zuul" + request.getContextPath());
        return true;
    }


    /*由preHandle 方法的解释我们知道这个方法包括后面要说到的afterCompletion 方法都只能是在当前所属的Interceptor 的preHandle 方法
    的返回值为true 时才能被调用。postHandle 方法，顾名思义就是在当前请求进行处理之后，也就是Controller 方法调用之后执行，但是它会
    在DispatcherServlet 进行视图返回渲染之前被调用，所以我们可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作*/
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /*该方法也是需要当前对应的Interceptor 的preHandle 方法的返回值为true 时才会执行。顾名思义，该方法将在整个请求结束之后，也就是在
    DispatcherServlet 渲染了对应的视图之后执行。这个方法的主要作用是用于进行资源清理工作的*/
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    /**/
    public void responseShow(HttpServletResponse response, String content) {
        //设置服务响应的字符编码为utf-8
        response.setCharacterEncoding("UTF-8");
        /*response.setContentType(MIME)的作用是使客户端浏览器，区分不同种类的数据，并根据不同的MIME调用浏览器内不同的程序嵌入模块来处理相应的数据。
         这 个方法设置发送到客户端的响应的内容类型，此时响应还没有提交。给出的内容类型可以包括字符编码说明，例
         如：text/html;charset=UTF-8.如果该方法在getWriter()方法被调用之前调用，那么响应的字符编码将仅从给出的内容类型
         中设置。该方法如果在getWriter()方法被调用之后或者在被提交之后调用，将不会设置响应的字符编码，在使用http协议的情况中，该方法设
         置 Content-type实体报头。 一般在Servlet中，习惯性的会首先设置请求以及响应的内容类型以及编码方式：
         response.setContentType("text/html;charset=UTF-8");*/
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = null;
        //将response写入流对象追加在content中
        try {
            out = response.getWriter();
            out.append(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
            out.close();
        }
    }

    /*获取请求的上下文绝对路径*/
    public String getAbsoluteyPath(HttpServletRequest request) {
        String absoluteContextPath;
        String portocol;
        portocol = request.isSecure() ? "https://" : "http://";
        absoluteContextPath = portocol + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        return absoluteContextPath;
    }
}
