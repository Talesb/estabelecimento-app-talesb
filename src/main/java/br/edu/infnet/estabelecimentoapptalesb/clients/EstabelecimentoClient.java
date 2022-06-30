package br.edu.infnet.estabelecimentoapptalesb.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.estabelecimentoapptalesb.model.domain.EstabelecimentoDTO;
import br.edu.infnet.estabelecimentoapptalesb.model.domain.FuncionarioDTO;
import br.edu.infnet.estabelecimentoapptalesb.model.domain.UsuarioDTO;

@FeignClient(url = "localhost:8080/api", name = "estabelecimentoClient")
public interface EstabelecimentoClient {

	// Estabelecimento
	@PostMapping(value = "/estabelecimento/incluir")
	public void incluirEstabelecimento(@RequestBody EstabelecimentoDTO estabelecimento);

	@GetMapping(value = "/estabelecimento")
	public List<EstabelecimentoDTO> obterTodosEstabelecimentos();

	@GetMapping("/estabelecimento/{idEstabelecimento}")
	public EstabelecimentoDTO obterPorId(@PathVariable Integer idEstabelecimento);

	// Funcionario
	@PostMapping(value = "/funcionario/incluir")
	public void incluirFuncionario(@RequestBody FuncionarioDTO funcionario);

	@GetMapping(value = "/funcionario/estabelecimento/{idEstabelecimento}")
	public List<FuncionarioDTO> obterFuncionariosPorEstabelecimento(@PathVariable Integer idEstabelecimento);

	@GetMapping(value = "/funcionario")
	public List<FuncionarioDTO> obterTodosFuncionarios();

	// Usuario
	@DeleteMapping("/usuario/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@PostMapping(value = "/usuario/validar", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UsuarioDTO validar(@RequestBody UsuarioDTO dto);

}
