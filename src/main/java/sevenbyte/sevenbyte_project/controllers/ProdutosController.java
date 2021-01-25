package sevenbyte.sevenbyte_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sevenbyte.sevenbyte_project.entities.Products;
import sevenbyte.sevenbyte_project.services.ProdutosService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutosController {
	
	private static final String LIST_URL = "/list";
	private static final String CREATE_URL = "/create";
	private static final String EDIT_URL = "/edit";
	private static final String DELETE_URL = "/delete";

	@Autowired
	private ProdutosService produtosService;	
	
	@GetMapping(value = ProdutosController.LIST_URL)
	@ResponseBody
	public Page<Products> listarProdutos(@RequestParam int size, @RequestParam int page) {
		return produtosService.findAll(PageRequest.of(page, size));
	}
	
	@PostMapping(value = ProdutosController.CREATE_URL)	
	@ResponseBody
	public Products criarProduto(@RequestBody Products produto) {
		return produtosService.save(produto);
	}
	
	@PostMapping(value = ProdutosController.EDIT_URL)	
	@ResponseBody
	public Products editarProduto(@RequestBody Products produto) {
		return produtosService.edit(produto);
	}
	
	@PostMapping(value = ProdutosController.DELETE_URL)	
	@ResponseBody
	public void editarProduto(@RequestParam Integer id) {
		produtosService.delete(id);
	}
}
