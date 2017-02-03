package spring.client.sentence.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.client.sentence.dao.AdjectiveClient;
import spring.client.sentence.dao.ArticleClient;
import spring.client.sentence.dao.NounClient;
import spring.client.sentence.dao.SubjectClient;
import spring.client.sentence.dao.VerbClient;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	VerbClient verbClient;
	@Autowired
	SubjectClient subjectClient;
	@Autowired
	ArticleClient articleClient;
	@Autowired
	AdjectiveClient adjectiveClient;
	@Autowired
	NounClient nounClient;
	
	
	@Override
	public String getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public String getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public String getArticle() {
		return articleClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public String getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	public String getNoun() {
		return nounClient.getWord();
	}

	public String getFallbackAdjective(){
		return "default adjective";
	}

}
