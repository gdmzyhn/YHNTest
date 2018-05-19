package com.yhntest.springmvc;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mjk on 2018/5/1.
 */
@WebFilter(urlPatterns = "/*", filterName = "loginFilter")
@Slf4j
public class UserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        log.info("UserFilter---ServletPath:{}", httpServletRequest.getServletPath());
        if (httpServletRequest.getServletPath().equalsIgnoreCase("/yhn.do")) {
            log.info("UserFilter---go to yhn.do");
            request.getRequestDispatcher("/yhn.do").forward(httpServletRequest, httpServletResponse);
            //httpServletResponse.sendRedirect("/yhn.do");
        }
        log.info("UserFilter---");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    @Override
    public void destroy() {

    }

}
