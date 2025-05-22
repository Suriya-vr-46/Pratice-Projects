package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMethods {
	
	public String getHtml(String tableName) {
	    StringBuilder html = new StringBuilder();
	    html.append("<html> <head> <title> Table View </title> </head>");
	    html.append("<body> <h1> PARTS table </h1> <table border='2'> <thead> <tr> ");
	    html.append("<th> ID </th> <th> Name </th> <th> Number </th> <th> Description </th> <th> Created At </th> <th> Created By </th> <th> Updated At </th> <th> Updated By </th> <th> Void Flag </th> </tr> </thead>");
	    html.append("<tbody> ");

	    try {
	        String sql = "SELECT * FROM " + tableName;

	        DBConnection db = new DBConnection();
	        Connection conn = db.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            html.append("<tr>");
	            html.append("<td>").append(rs.getInt("id")).append("</td>");
	            html.append("<td>").append(rs.getString("name")).append("</td>");
	            html.append("<td>").append(rs.getString("number")).append("</td>");
	            html.append("<td>").append(rs.getString("description")).append("</td>");
	            html.append("<td>").append(rs.getString("created_at")).append("</td>");
	            html.append("<td>").append(rs.getString("created_by")).append("</td>");
	            html.append("<td>").append(rs.getString("updated_at")).append("</td>");
	            html.append("<td>").append(rs.getString("updated_by")).append("</td>");
	            html.append("<td>").append(rs.getString("void_flag")).append("</td>");
	            html.append("</tr>");
	        }

	        html.append("</tbody> </table> </body> </html>");
	        return html.toString();

	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }

	    return null;
	}

}
