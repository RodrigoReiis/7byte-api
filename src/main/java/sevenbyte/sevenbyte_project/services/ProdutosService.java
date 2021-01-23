package sevenbyte.sevenbyte_project.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import sevenbyte.sevenbyte_project.entities.Products;
import sevenbyte.sevenbyte_project.repository.ProdutosRepository;

@Service
@Transactional
public class ProdutosService {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public Products save(Products produto) {
		return produtosRepository.save(produto);
	};
	
	public Products edit(Products produto) {		
		return produtosRepository.save(produto);
	};
	
	public void delete(Integer id) {		
		produtosRepository.deleteById(id);
	};
	
	public Page<Products> findAll(Pageable pagination) {
		return produtosRepository.findAll(pagination);
	};
}
