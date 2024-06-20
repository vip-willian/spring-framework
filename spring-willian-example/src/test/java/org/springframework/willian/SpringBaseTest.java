package org.springframework.willian;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.willian.circular.reference.IdCardObj;
import org.springframework.willian.circular.reference.UserObj;
import org.springframework.willian.obj.Account;

/**
 * @author <a href="mailto:wangyan@cai-inc.com">沐风</a>
 * @datetime 2024-06-19 17:29:04
 */
@Slf4j
public class SpringBaseTest {

	@Test
	public void testSpring(){

		// 基于xml方式创建spring容器，容器的初始化
		ApplicationContext context = new GenericXmlApplicationContext("spring-config.xml");
		Account account = context.getBean(Account.class);
		log.info("account ------> {}", account);
	}

	@Test
	public void testSpringCircularReferences() {

		// 基于xml方式创建spring容器，容器的初始化
		ApplicationContext context = new GenericXmlApplicationContext("spring-circular-references-config.xml");

		UserObj user = context.getBean(UserObj.class);
		log.info("user ------> {}", user);

		IdCardObj idCard = context.getBean(IdCardObj.class);
		log.info("idCard ------> {}", idCard);
	}
}
