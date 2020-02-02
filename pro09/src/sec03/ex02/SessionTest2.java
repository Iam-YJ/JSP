package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest2
 */
@WebServlet("/sess2")
public class SessionTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println("���� ���̵� : "+session.getId()+"<br>");
		out.println("���� ���� ���� �ð� : "+new Date (session.getCreationTime())+"<br>");
		out.println("���� ��ȿ �ð� : "+session.getMaxInactiveInterval()+"<br>");
		
		out.println("�⺻ ���� ��ȿ �ð� : "+session.getMaxInactiveInterval()+"<br>");
		session.setMaxInactiveInterval(5);
		out.println("�⺻ ���� ��ȿ �ð� : "+session.getMaxInactiveInterval()+"<br>");
		
		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�");
		}
	}

}
