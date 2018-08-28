package com.cake.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//处理登录和未登录状况

public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if ("/login.do".equals(((HttpServletRequest)servletRequest).getServletPath()) ||
                "/loginPrompt.do".equals(((HttpServletRequest)servletRequest).getServletPath())) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else if (null != ((HttpServletRequest)servletRequest).getSession().getAttribute("username")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletRequest.getRequestDispatcher("/loginPrompt.do").forward(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
