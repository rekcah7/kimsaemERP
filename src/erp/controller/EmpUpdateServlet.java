package erp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import erp.dto.EmpDTO;
import erp.service.EmpService;
import erp.service.EmpServiceImpl;
@WebServlet(name = "emp/update", urlPatterns = { "/emp/update.do" })
public class EmpUpdateServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,
					HttpServletResponse res)
						throws ServletException,IOException{
		System.out.println("������ ��û ����");
		req.setCharacterEncoding("euc-kr");
	
		
		//1. Ŭ���̾�Ʈ�� ��û���� ����
		String id = req.getParameter("id");
		String addr = req.getParameter("addr");
		String point = req.getParameter("point");
		String grade = req.getParameter("grade");
		
		//2. �����Ͻ� �޼ҵ� ȣ��
		EmpDTO user =
				new EmpDTO(id, addr, grade,Integer.parseInt(point));
		System.out.println(user);
		
		EmpService service = new EmpServiceImpl();
		int result = service.update(user);
		
		//4. ��û������ - forward
		String view = "";
		if(result>=1){
			view = "/serverweb/emp/list.do";
		}else{
			view = "/serverweb/emp/read.do?id="+id+"&action=UPDATE";
		}
		res.sendRedirect(view);
		
	}
}












