package com.xue.chapter2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 创建客户
 * Created by xnl on 2016/11/16.
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {
    /**
     * 进入【创建客户】界面
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //super.doGet(request, response);
        request.setAttribute("param", "派发成功！");
        request.getRequestDispatcher("/WEB-INF/view/123.jsp").forward(request, response);
    }

    /**
     * 处理【创建客户】请求
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //super.doPost(request, response);

    }
}
