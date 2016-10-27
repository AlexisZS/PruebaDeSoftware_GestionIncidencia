package test.gi.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gi.entity.Categoria;
import com.gi.service.CategoriaService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestCategoriaService {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestCategoriaService .class);
	private static final Gson GSON = new GsonBuilder().serializeNulls().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

	private CategoriaService categoriaService;
	
	@Before
	public void setUp() {
		categoriaService = (CategoriaService) context.getBean("categoriaService");
	}
	
	
	@Test
	public void testGetListIncidenciaOk(){
		List<Categoria> list = categoriaService.getListCategoria();
		Assert.assertTrue(list.size() > 0);
		LOGGER.info("Lista de Incidencia:  /n" + GSON.toJson(list));
	}
	
	
}
