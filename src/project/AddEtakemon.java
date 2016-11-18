package project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Marc on 18/11/2016.
 */
@WebServlet("/add-etakemon")
public class AddEtakemon extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String nickname = (req.getParameter("nickname"));
        String name = (req.getParameter("name"));
        String type = (req.getParameter("type"));

        Etakemon etak = new Etakemon(name, type);

        Singleton.getInstance().addEtakemon(nickname, etak);
        req.getRequestDispatcher("/index.jsp").forward(req, res);
    }

}
