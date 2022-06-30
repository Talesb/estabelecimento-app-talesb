package br.edu.infnet.estabelecimentoapptalesb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.estabelecimentoapptalesb.clients.EstabelecimentoClient;
import br.edu.infnet.estabelecimentoapptalesb.model.domain.EstabelecimentoDTO;

@Service
public class EstabelecimentoService {

	@Autowired
	private EstabelecimentoClient estabelecimentoClient;

	public void incluir(EstabelecimentoDTO estabelecimento) {
		this.estabelecimentoClient.incluirEstabelecimento(estabelecimento);
	}

	public List<EstabelecimentoDTO> obterTodos() {
		return estabelecimentoClient.obterTodosEstabelecimentos();
	}

	public EstabelecimentoDTO obterPorId(Integer idEstabelecimento) {
		return this.estabelecimentoClient.obterPorId(idEstabelecimento);

	}

	public void remover(Integer idEstabelecimento) {
		this.estabelecimentoClient.excluir(idEstabelecimento);
	}

}
