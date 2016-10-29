package test.gi.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gi.entity.Incidencia;
import com.gi.service.IncidenciaService;

public class TestIncidencia {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");
	
	@Autowired
	private IncidenciaService incidenciaService;
	
	@Before
	public void setUp() {
		incidenciaService = (IncidenciaService) context.getBean("incidenciaService");
	}
	
	
	@Test
	public void testGetListIncidenciaOk(){
		List<Incidencia> list = incidenciaService.getListIncidencia();
		Assert.assertTrue(!list.isEmpty());
		print(list);
	}
	
	
	public <T> void print(List<T> list){
		for (T entity : list) {
			System.out.println(entity.toString());
		}
	}
	
}
