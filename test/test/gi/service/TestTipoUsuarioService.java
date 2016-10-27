package test.gi.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gi.entity.TipoUsuario;
import com.gi.service.TipoUsuarioService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestTipoUsuarioService {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestTipoUsuarioService .class);
	private static final Gson GSON = new GsonBuilder().serializeNulls().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

	private TipoUsuarioService tipoUsuarioService;
	
	@Before
	public void setUp() {
		tipoUsuarioService = (TipoUsuarioService) context.getBean("tipoUsuarioService");
	}
	
	
	@Test
	public void testGetListIncidenciaOk(){
		List<TipoUsuario> list = tipoUsuarioService.getListTipoUsuario();
		Assert.assertTrue(list.size() > 0);
		LOGGER.info("Lista de Incidencia:  /n" + GSON.toJson(list));
	}
	
	
}
