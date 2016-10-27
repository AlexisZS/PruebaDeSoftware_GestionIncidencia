package test.gi.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gi.entity.Estado;
import com.gi.service.EstadoService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestEstadoService {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestEstadoService .class);
	private static final Gson GSON = new GsonBuilder().serializeNulls().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

	private EstadoService incidenciaService;
	
	@Before
	public void setUp() {
		incidenciaService = (EstadoService) context.getBean("incidenciaService");
	}
	
	
	@Test
	public void testGetListIncidenciaOk(){
		List<Estado> list = incidenciaService.getListEstado();
		Assert.assertTrue(list.size() > 0);
		LOGGER.info("Lista de Incidencia:  /n" + GSON.toJson(list));
	}
	
	
}
