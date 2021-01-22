package sevenbyte.sevenbyte_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sevenbyte.sevenbyte_project.entities.Produtos;
import sevenbyte.sevenbyte_project.repository.ProdutosRepository;

@Service
@Transactional
public class ProdutosService {
	
	private ProdutosRepository produtosRepository;
	
	@Autowired
	private void produtosRepository(ProdutosRepository produtosRepository) {
		this.produtosRepository = produtosRepository;
	}
	
	public Produtos save(Produtos produto) {
		return produtosRepository.save(produto);
	};
	
	public Page<Produtos> findAll(Pageable pagination) {
		return produtosRepository.findAll(pagination);
	};
}
