package mvc.controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import mvc.dao.MailDao;


import mvc.dao.ConstDao;
import mvc.dto.MailResponseBody;
import mvc.dto.Views;
import mvc.util.ComboBoxResponseBody;
import mvc.util.Constant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class UtilAjaxController {

	Constant cons;
	ApplicationContext context =
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
	ConstDao dao = (ConstDao) context.getBean("utilDAO");
	
	@JsonView(Views.Public.class)
	@RequestMapping(value = "getSampleData")
	public ComboBoxResponseBody getSampleData() throws MessagingException, IOException {
		ComboBoxResponseBody result = new ComboBoxResponseBody();
		result.setItemID("123");
		result.setItemName("123 content"); 
		
		return result;
	}
	
	
	@JsonView(Views.Public.class)
	@RequestMapping(value = "api")
	public String testpai() throws MessagingException, IOException {

		dao.getApi();
    	
		return "";
	}
}
