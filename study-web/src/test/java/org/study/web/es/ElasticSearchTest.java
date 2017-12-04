package org.study.web.es;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.cy.study.SpringBootMain;
import com.cy.study.es.Article;
import com.cy.study.es.ArticleSearchRepository;
import com.cy.study.es.Author;
import com.cy.study.es.Tutorial;

/**
 * @author cy
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ElasticSearchTest {

	@Autowired
	private ArticleSearchRepository articleSearchRepository;

	@Test
	public void testSaveArticleIndex() {
		Author author = new Author();
		author.setId(1L);
		author.setName("tianshouzhi");
		author.setRemark("java developer");

		Tutorial tutorial = new Tutorial();
		tutorial.setId(1L);
		tutorial.setName("elastic search");

		Article article = new Article();
		article.setId(1L);
		article.setTitle("springboot integreate elasticsearch");
		article.setAbstracts("springboot integreate elasticsearch is very easy");
		article.setTutorial(tutorial);
		article.setAuthor(author);
		article.setContent("elasticsearch based on lucene," + "spring-data-elastichsearch based on elaticsearch"
				+ ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
		article.setPostTime(new Date());
		article.setClickCount(1L);

		Article article2 = new Article();
		article2.setId(2L);
		article2.setTitle("");
		article2.setAbstracts("陈勇");
		article2.setTutorial(tutorial);
		article2.setAuthor(author);
		article2.setContent("陈勇");
		article2.setPostTime(new Date());
		article2.setClickCount(2L);

		List<Article> list = new ArrayList<Article>();
		list.add(article);
		list.add(article2);
		articleSearchRepository.save(list);
	}

	@Test
	public void testSearch() {
		String queryString = " 勇";// 搜索关键字
		QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
		Iterable<Article> searchResult = articleSearchRepository.search(builder);
		Iterator<Article> iterator = searchResult.iterator();
		while (iterator.hasNext()) {
			Article article = iterator.next();
			System.out.println(JSON.toJSONString(article) + "===================================");
		}
	}

}
