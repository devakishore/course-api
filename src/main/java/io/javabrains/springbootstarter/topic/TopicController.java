package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TopicController {

	@Autowired 
	private TopicService topicService;
	
	   @RequestMapping("/topics")
	   
	   public List<Topic> getAllTopics() 
	   {
		   return topicService.getAllTopics();
	   
	   /*{
		   return  Arrays.asList(
				   new Topic("spring","Spring framework","Spring Framework Description"),
				   new Topic("SQL Server ","Always Encrypted","Always On"),
		           new Topic("javascript","Javaspring","Maven")
				   );*/ 
		   
	   }
	
}
