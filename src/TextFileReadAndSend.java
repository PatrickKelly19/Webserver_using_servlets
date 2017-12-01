import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/TextFileReadAndSend")

public class TextFileReadAndSend extends HttpServlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("filename");

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jkjke\\Documents\\PythonProject\\Scripts\\"+name+".txt"));

        String str;
        while( (str = br.readLine()) != null )
        {
            out.println(str + "<BR>");
        }

        br.close();
        out.close();
    }
}