package hibernate_h2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import models.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateH2SampleApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	public void contextLoads() {
		assertNotNull(repository);
	}
}
