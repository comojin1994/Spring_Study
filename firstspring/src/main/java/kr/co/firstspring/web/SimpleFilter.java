package kr.co.firstspring.web;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
public class SimpleFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Filter - Hello World");
        HttpSession session = ((HttpServletRequest)servletRequest).getSession();
        String username = (String) session.getAttribute("username");
        if(username == null){
            log.info("new user");
            session.setAttribute("username", "kimsungjin");
        } else {
            log.info("user -> " + username);
        }

        filterChain.doFilter(servletRequest, servletResponse);
        var writer = servletResponse.getWriter();
        writer.println("filter - Hello World!!");

    }
}
