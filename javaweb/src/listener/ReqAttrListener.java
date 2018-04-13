package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ReqAttrListener implements ServletRequestAttributeListener {

    
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
        System.out.println("attr remove : " + srae.getName());
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println("attr add : " + srae.getName());
    }

	
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println("attr replaced : " + srae.getName());
    }
	
}
