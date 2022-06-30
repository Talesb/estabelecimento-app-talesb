package br.edu.infnet.estabelecimentoapptalesb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estabelecimentoapptalesb.model.domain.EstabelecimentoDTO;
import br.edu.infnet.estabelecimentoapptalesb.model.domain.FuncionarioDTO;
import br.edu.infnet.estabelecimentoapptalesb.model.service.EstabelecimentoService;
import br.edu.infnet.estabelecimentoapptalesb.model.service.FuncionarioService;

@Controller
public class funcionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@GetMapping(value = "/funcionario")
	public String cadastro(Model model) {
		model.addAttribute("listaEstabelecimento", estabelecimentoService.obterTodos());
		return "funcionario/cadastro";
	}

	@PostMapping(value = "/funcionario/incluir")
	public String incluir(Model model, FuncionarioDTO funcionario) {
		funcionarioService.incluir(funcionario);
		return "redirect:/funcionarios";
	}

	@GetMapping(value = "/funcionarios")
	public String estabelecimentos(Model model) {
		return telalista(model);
	}

	private String telalista(Model model) {
		model.addAttribute("listaFuncionarios", funcionarioService.obterLista());
		return "funcionario/lista";
	}

	@GetMapping(value = "/funcionario/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		funcionarioService.remover(id);
		return "redirect:/funcionarios";
	}

}
