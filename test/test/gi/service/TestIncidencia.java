package test.gi.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gi.entity.Incidencia;
import com.gi.service.IncidenciaService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestIncidencia {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestIncidencia .class);
	private static final Gson GSON = new GsonBuilder().serializeNulls().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

	private IncidenciaService incidenciaService;
	
	@Before
	public void setUp() {
		incidenciaService = (IncidenciaService) context.getBean("incidenciaService");
	}
	
	
	@Test
	public void testGetListIncidencia(){
		List<Incidencia> list = incidenciaService.getListIncidencia();
		for (Incidencia incidencia : list) {
			System.out.println(incidencia.getTbCategoria().getDesCat());
		}
		
//		LOGGER.info("Lista de Incidencia:  /n" + GSON.toJson(list));
	}
}
