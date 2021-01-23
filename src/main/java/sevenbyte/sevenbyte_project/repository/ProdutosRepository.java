package sevenbyte.sevenbyte_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sevenbyte.sevenbyte_project.entities.Products;

@Repository
public interface ProdutosRepository extends JpaRepository<Products, Integer>{

}
