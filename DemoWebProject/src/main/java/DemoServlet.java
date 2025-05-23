
import jdbc.DBMethods;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static  DBMethods dbm = new DBMethods();
       
	
    public DemoServlet() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String html  = null;
		if(name.equals("PARTS")) {
			html = dbm.getPARTS(name);			
		} else if (name.equals("PART")) {
			html = dbm.getPART(name);
		}
		
		if(html == null) {
			System.out.println("No Html Content!");
			return;
		}
		response.setContentType("text/html");
		response.getWriter().write(html);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
