package project;

/**
 * Created by Marc on 18/11/2016.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-user")
public class AddUser extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String nickname = (req.getParameter("nickname"));
        String password = req.getParameter("password");

        Singleton.getInstance().insertUser(nickname,password);
        req.getRequestDispatcher("/index.jsp").forward(req, res);



    }
}

