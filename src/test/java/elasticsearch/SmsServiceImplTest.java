
package elasticsearch;

import javax.annotation.Resource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.zking.zzcloudspringbootstarter.sms.ISmsService;

@SpringBootTest(classes = DemoApplication.class)
class SmsServiceImplTest {

	@Resource
	private ISmsService smsService;

	@BeforeEach
	void setUp() {
				
	}

	@AfterEach
	void tearDown() {
		
	}

	@Test
	void testRedis() {
		smsService.send("15575488448", "pengying", "1", "小彭不会秃头加油干！");
	}
	
}
