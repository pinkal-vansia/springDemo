/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springDemo.web;

import org.springframework.web.servlet.ModelAndView;
import springDemo.web.HelloController;
import junit.framework.TestCase;

/**
 *
 * @author pinks
 */
public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}
