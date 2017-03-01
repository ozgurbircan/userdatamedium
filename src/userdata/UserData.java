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
			httpServletResponse.setContentType("text/html;charset=ISO-8859-9");//burada türkçe karakter sorununu 
																			  //çözüyoruz ve dönüþ tipini html text olarak beliliyoruz
			
			
			String name=httpServletRequest.getParameter("name");//parametre bilgileri alýyoruz.
			String surName=httpServletRequest.getParameter("surName");
			String mailAdress=httpServletRequest.getParameter("mailAdress");
			String userName=httpServletRequest.getParameter("userName");
			String userPassword=httpServletRequest.getParameter("userPassword");
			PrintWriter printWriter=httpServletResponse.getWriter();//Ekrana Çýktý vermemizi saðlayan sýnýfýmýz.
			printWriter.print("<html>");
            printWriter.print("<head> <meta charset='ISO-8859-9'> </head>");
            printWriter.print("<body>");    
			printWriter.println("Adýnýz: "+name+"<br>");
			printWriter.println("Soyadýnýz: "+surName+"<br>");
			printWriter.println("Mail Adresiniz: "+mailAdress+"<br>");
			printWriter.println("Kullanýcý Adýnýz: "+userName+"<br>");
			printWriter.println("Þifreniz: "+userPassword);
			printWriter.print("</body> </html>");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}
	@Override
	public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
	{
		try {
			httpServletResponse.setContentType("text/html;charset=ISO-8859-9");//burada türkçe karakter sorununu 
																			  //çözüyoruz ve dönüþ tipini html text olarak beliliyoruz
			
			String name=httpServletRequest.getParameter("name");//parametre bilgileri alýyoruz.
			String surName=httpServletRequest.getParameter("surName");
			String mailAdress=httpServletRequest.getParameter("mailAdress");
			String userName=httpServletRequest.getParameter("userName");
			String userPassword=httpServletRequest.getParameter("userPassword");
			PrintWriter printWriter=httpServletResponse.getWriter();//Ekrana Çýktý vermemizi saðlayan sýnýfýmýz.
			printWriter.print("<html>");
            printWriter.print("<head> <meta charset='ISO-8859-9'> </head>");
            printWriter.print("<body>");    
			printWriter.println("Adýnýz: "+name+"<br>");
			printWriter.println("Soyadýnýz: "+surName+"<br>");
			printWriter.println("Mail Adresiniz: "+mailAdress+"<br>");
			printWriter.println("Kullanýcý Adýnýz: "+userName+"<br>");
			printWriter.println("Þifreniz: "+userPassword);
			printWriter.print("</body> </html>");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
