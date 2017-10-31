package mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class PartnerController {

    
/*	ApplicationContext context =
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
	MailDao dao = (MailDao) context.getBean("mailDAO");*/

    @RequestMapping("/partner/affiliates/add")
    public String affiliatesAdd(Model model) {
        
        return "partner/affiliatesAdd";
        
    }
    
}
