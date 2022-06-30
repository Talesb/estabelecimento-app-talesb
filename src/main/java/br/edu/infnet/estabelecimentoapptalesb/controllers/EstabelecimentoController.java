package br.edu.infnet.estabelecimentoapptalesb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.estabelecimentoapptalesb.model.domain.EstabelecimentoDTO;
import br.edu.infnet.estabelecimentoapptalesb.model.service.EstabelecimentoService;

@Controller
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@GetMapping(value = "/estabelecimento")
	public String cadastro() {
		return "estabelecimento/cadastro";
	}

	@PostMapping(value = "/estabelecimento/incluir")
	public String incluir(Model model, EstabelecimentoDTO estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
		return "redirect:/estabelecimentos";
	}

	@GetMapping(value = "/estabelecimentos")
	public String estabelecimentos(Model model) {
		return telalista(model);
	}

	private String telalista(Model model) {
		model.addAttribute("listaEstabelecimento", estabelecimentoService.obterTodos());
		return "estabelecimento/lista";
	}

	@GetMapping(value = "/estabelecimento/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		estabelecimentoService.remover(id);
		return "redirect:/estabelecimentos";
	}

}
