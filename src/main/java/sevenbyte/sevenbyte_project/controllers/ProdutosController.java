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

import sevenbyte.sevenbyte_project.entities.Produtos;
import sevenbyte.sevenbyte_project.services.ProdutosService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutosController {
	
	private static final String LIST_URL = "/list";
	private static final String CREATE_URL = "/create";
	
	@Autowired
	private ProdutosService produtosService;	
	
	@GetMapping(value = ProdutosController.LIST_URL)
	@ResponseBody
	public Page<Produtos> listarProdutos(@RequestParam int size, @RequestParam int page) {
		return produtosService.findAll(PageRequest.of(page, size));
	}
	
	@PostMapping(value = ProdutosController.CREATE_URL)	
	@ResponseBody
	public Produtos criarProduto(@RequestBody Produtos produto) {
		return produtosService.save(produto);
	}
}
