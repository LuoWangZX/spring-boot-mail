package com.wzx;

import com.wzx.utils.MailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMailApplicationTests {
	@Autowired
	private MailUtil mailUtil;
	@Test
	public void sendMail() throws Exception {
		mailUtil.sendMail("2581985569@qq.com","开会通知","<b style='color:red'>今晚19:30，全体开会</b>");
	}
}
