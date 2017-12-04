package org.study.web.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.study.SpringBootMain;

/**
 * @author cy
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KafkaTest {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Test
	public void TestKaFka() {


		kafkaTemplate.send("test-topic", "hello");
		kafkaTemplate.send("test-topic", "key-1", "hello");
	}

}
