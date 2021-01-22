package sevenbyte.sevenbyte_project.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import sevenbyte.sevenbyte_project.entities.Produtos;

@Repository
public interface ProdutosRepository extends MongoRepository<Produtos, ObjectId>{

}
