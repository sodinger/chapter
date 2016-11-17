package com.xue.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xnl on 2016/11/16.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //super.doGet(request, response);//有此行代码，派发并跳转不成功
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = df.format(new Date());
        request.setAttribute("currentTime", currentTime);
        request.getRequestDispatcher("/WEB-INF/jsp/helloservlet.jsp").forward(request, response);
    }
}
