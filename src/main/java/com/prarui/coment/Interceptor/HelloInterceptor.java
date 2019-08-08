package com.prarui.coment.Interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloInterceptor extends HandlerInterceptorAdapter {
        /**
         * This implementation always returns {@code true}.
         */
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                throws Exception {
            System.out.println("preHandle---->execute");
            return true;
        }

        /**
         * This implementation is empty.
         */
        @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)throws Exception {
            System.out.println("postHandle--->execute");
        }

        /**
         * This implementation is empty.
         */
        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {
            System.out.println("afterCompletion--->");
        }

        /**
         * This implementation is empty.
         */
        @Override
        public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
            System.out.println("afterConcurrentHandlingStarted--->");
        }

}
