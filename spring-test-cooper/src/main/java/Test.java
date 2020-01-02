import com.config.AppConfig;
import com.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TestDao testDao  = (TestDao) annotationConfigApplicationContext.getBean("com.dao.TestDao");
		testDao.test();
	}
}
