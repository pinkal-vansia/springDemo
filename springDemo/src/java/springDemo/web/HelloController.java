/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springDemo.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;

/**
 *
 * @author pinks
 */
public class HelloController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws ServletException, IOException {
        logger.info("Returning hello view");
        return new ModelAndView("hello.jsp");
    }
}
