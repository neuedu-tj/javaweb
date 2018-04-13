package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class SessionAttrListener implements HttpSessionAttributeListener {

   
    public SessionAttrListener() {
     
    }

	
    public void attributeAdded(HttpSessionBindingEvent se)  { 
       System.out.println("session attr add -> " + se.getName() + " : " + se.getSource());
    }

	
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	System.out.println("session attr remove -> " + se.getName() + " : " + se.getSource());
    }

	
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println("session attr replaced -> " + se.getName() + " : " + se.getSource());
    }
	
}
