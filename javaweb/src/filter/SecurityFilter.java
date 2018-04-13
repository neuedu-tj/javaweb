package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/page/*")
public class SecurityFilter implements Filter {
	
	
	
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain )
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("isLogin")==null) {
			response.sendRedirect("../login.html");
			
		} else if( session.getAttribute("isLogin").toString().equalsIgnoreCase("ok")) {
			chain.doFilter(request, response);
		}
		
	}

}
