package test.gi.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gi.entity.Incidencia;
import com.gi.service.IncidenciaService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestIncidencia {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestIncidencia .class);
	private static final Gson GSON = new GsonBuilder().serializeNulls().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

	@Autowired
	private IncidenciaService incidenciaService;
	
	@Before
	public void setUp() {
		incidenciaService = (IncidenciaService) context.getBean("incidenciaService");
	}
	
	
	@Test
	public void testGetListIncidenciaOk(){
		List<Incidencia> list = incidenciaService.getListIncidencia();
		Assert.assertTrue(list.size() > 0);
		LOGGER.info("Lista de Incidencia:  /n" + GSON.toJson(list));
	}
	
	
	@Test
	public void testRegistroIncidencia(){
		incidenciaService.registar(loadMock());
	}


	private Incidencia loadMock() {
		Incidencia entity = new Incidencia();
		entity.setTituInc("Test2");
		entity.setDesInc("Desc Test 2");
		entity.setRutaDoc("c:/user/");
		entity.setCodPri(1);
		return entity;
	}
	
}
