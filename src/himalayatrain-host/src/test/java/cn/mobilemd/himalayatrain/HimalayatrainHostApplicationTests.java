package cn.mobilemd.himalayatrain;

import cn.mobilemd.himalayatrain.service.ICityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HimalayatrainHostApplicationTests {

		@Autowired
	private ICityService cityService;

	@Test
	public void Whether_Can_Auto_CloseConnetion() {
		int n=100000;
		try{
			for (int j = 0; j <n; j++) {
				cityService.getCity(1);
			}
		}catch (Exception e){
			String msg =e.getMessage();
		}

	}

}
