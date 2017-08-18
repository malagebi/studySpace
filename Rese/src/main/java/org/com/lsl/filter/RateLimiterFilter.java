package org.com.lsl.filter;

import com.google.common.util.concurrent.RateLimiter;
import org.jboss.logging.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 限流过滤器
 */
public class RateLimiterFilter implements Filter {
    private static Logger log = Logger.getLogger(RateLimiterFilter.class);
    private RateLimiter rateLimiter = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        rateLimiter = RateLimiter.create(200);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("进入限流----------");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        if (rateLimiter.tryAcquire()) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            req.getRequestDispatcher("WEB-INF/").forward(req, res);
        }

    }

    @Override
    public void destroy() {

    }
}
