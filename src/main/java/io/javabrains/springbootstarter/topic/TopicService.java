package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			   new Topic("spring","Spring framework","Spring Framework Description"),
			   new Topic("SQL Server ","Always Encrypted","Always On"),
			   new Topic("Oracle ","MySQL","Mongodb")
			   ); 

	public List<Topic> getAllTopics()  {
		return topics;
	}
	
}
