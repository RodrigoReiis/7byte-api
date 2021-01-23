package sevenbyte.sevenbyte_project;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import sevenbyte.sevenbyte_project.entities.Products;
import sevenbyte.sevenbyte_project.repository.ProdutosRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ProdutosControllerTest {
	
	 @Autowired
     private MockMvc mockMvc;

     @MockBean
     private ProdutosRepository produtosRepository;

     @LocalServerPort
     private int port;

     private String getRootUrl() {
         return "http://localhost:" + port;
     }

     @Test
     public void contextLoads() {

     }
     
     @Test
     public void testGetAllProducts() {
    	 Products produto = new Products("nome", "descricao", "preco", "peso", "quantidade", "imagem");
    	 List<Products> productsList = new ArrayList<Products>();
    }
     
     @Test
     public void testAddNewProduct() {
    	 
     }

}
