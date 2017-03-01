package userdata;

import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="UserData",urlPatterns={"/userData"})
public class UserData extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)
	{
		try {
			httpServletResponse.setContentType("text/html;charset=ISO-8859-9");//burada t�rk�e karakter sorununu 
																			  //��z�yoruz ve d�n�� tipini html text olarak beliliyoruz
			
			
			String name=httpServletRequest.getParameter("name");//parametre bilgileri al�yoruz.
			String surName=httpServletRequest.getParameter("surName");
			String mailAdress=httpServletRequest.getParameter("mailAdress");
			String userName=httpServletRequest.getParameter("userName");
			String userPassword=httpServletRequest.getParameter("userPassword");
			PrintWriter printWriter=httpServletResponse.getWriter();//Ekrana ��kt� vermemizi sa�layan s�n�f�m�z.
			printWriter.print("<html>");
            printWriter.print("<head> <meta charset='ISO-8859-9'> </head>");
            printWriter.print("<body>");    
			printWriter.println("Ad�n�z: "+name+"<br>");
			printWriter.println("Soyad�n�z: "+surName+"<br>");
			printWriter.println("Mail Adresiniz: "+mailAdress+"<br>");
			printWriter.println("Kullan�c� Ad�n�z: "+userName+"<br>");
			printWriter.println("�ifreniz: "+userPassword);
			printWriter.print("</body> </html>");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}
	@Override
	public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
	{
		try {
			httpServletResponse.setContentType("text/html;charset=ISO-8859-9");//burada t�rk�e karakter sorununu 
																			  //��z�yoruz ve d�n�� tipini html text olarak beliliyoruz
			
			String name=httpServletRequest.getParameter("name");//parametre bilgileri al�yoruz.
			String surName=httpServletRequest.getParameter("surName");
			String mailAdress=httpServletRequest.getParameter("mailAdress");
			String userName=httpServletRequest.getParameter("userName");
			String userPassword=httpServletRequest.getParameter("userPassword");
			PrintWriter printWriter=httpServletResponse.getWriter();//Ekrana ��kt� vermemizi sa�layan s�n�f�m�z.
			printWriter.print("<html>");
            printWriter.print("<head> <meta charset='ISO-8859-9'> </head>");
            printWriter.print("<body>");    
			printWriter.println("Ad�n�z: "+name+"<br>");
			printWriter.println("Soyad�n�z: "+surName+"<br>");
			printWriter.println("Mail Adresiniz: "+mailAdress+"<br>");
			printWriter.println("Kullan�c� Ad�n�z: "+userName+"<br>");
			printWriter.println("�ifreniz: "+userPassword);
			printWriter.print("</body> </html>");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
