package controller;

import java.io.IOException;
import service.PersonalityCalculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/personality"})
public class PersonalityViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PersonalityViewController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering do get");
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/personalityView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String options=request.getParameter("selectedOptions");
		
		//personalitycalculator  class
		PersonalityCalculator object=new PersonalityCalculator();
		
		String message=object.findYourBrainType(options);
		
		System.out.println(options);
				
		
		 

		request.setAttribute("message", message);
		
		if(message!=null)
		{
			if(message.equals("rightbrained")) {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/rightBrainView.jsp");
				rd.forward(request, response);
			}
			else if(message.equals("leftbrained")) {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/leftBrainView.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/neutralView.jsp");
				rd.forward(request, response);
			}
		
		}
	}
	}


