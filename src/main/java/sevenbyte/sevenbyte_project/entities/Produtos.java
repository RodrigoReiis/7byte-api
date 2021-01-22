package sevenbyte.sevenbyte_project.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Generated;

@Data
@Document(collection="products")
public class Produtos {
	
	@Id
	private long id;
	
	private String nome;

}
