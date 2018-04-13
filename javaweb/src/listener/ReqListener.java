package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ReqListener implements ServletRequestListener {

 
    public void requestDestroyed(ServletRequestEvent sre)  { 
        System.out.println("请求完毕");
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("请求出现");
    }
	
}
