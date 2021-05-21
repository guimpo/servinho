package edu.self.servlet.first;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnotherServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String destination = "index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
        String name = "John";
        request.setAttribute("name", name);

        Integer numberOfItems = 1000;
        request.setAttribute("itemCount", numberOfItems);

        List<String> fruits = Arrays.asList("Apple", "Banana", "Lemon", "Papaya");
        request.setAttribute("itemCount", numberOfItems);
        requestDispatcher.forward(request, response);
    }

}