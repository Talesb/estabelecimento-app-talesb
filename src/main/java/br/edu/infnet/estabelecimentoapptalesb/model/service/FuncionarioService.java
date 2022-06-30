package br.edu.infnet.estabelecimentoapptalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.estabelecimentoapptalesb.clients.EstabelecimentoClient;
import br.edu.infnet.estabelecimentoapptalesb.model.domain.FuncionarioDTO;

@Service
public class FuncionarioService {

	@Autowired
	private EstabelecimentoClient estabelecimentoClient;

	public List<FuncionarioDTO> obterListaPorEstabelecimento(Integer idEstabelecimento) {
		return estabelecimentoClient.obterFuncionariosPorEstabelecimento(idEstabelecimento);
	}

	public List<FuncionarioDTO> obterLista() {
		return this.estabelecimentoClient.obterTodosFuncionarios();
	}

	public void incluir(FuncionarioDTO funcionariodto) {
		this.estabelecimentoClient.incluirFuncionario(funcionariodto);
	}

	public void remover(Integer idFuncionario) {
		this.estabelecimentoClient.excluir(idFuncionario);
	}

}
