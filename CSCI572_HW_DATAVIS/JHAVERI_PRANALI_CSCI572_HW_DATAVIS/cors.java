package CORS;


import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class cors
 */
@WebServlet("/cors")
public class cors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String query = "http://localhost:8983/solr/memex/select?q=*%3A*&wt=json&indent=true";
		URL url = new URL(query);
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		String genreJson = IOUtils.toString(is);
		PrintWriter out = response.getWriter();
		//resp.setContentType("application/json; charset=UTF-8");
		try {
		JSONObject genreJsonObject = (JSONObject) JSONValue.parseWithException(genreJson);
		System.out.println(genreJson);
		
		try (FileWriter file = new FileWriter("solr.json")) {
			file.write(genreJsonObject.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + genreJsonObject);
		}


		out.println(genreJson);
		/*JSONObject header = (JSONObject) genreJsonObject.get("responseHeader");
		JSONObject params = (JSONObject) header.get("params");
		String status = (String) params.get("q");
		System.out.println(status);
		*/
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
