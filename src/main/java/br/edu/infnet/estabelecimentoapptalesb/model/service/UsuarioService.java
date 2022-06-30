package br.edu.infnet.estabelecimentoapptalesb.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.estabelecimentoapptalesb.clients.EstabelecimentoClient;
import br.edu.infnet.estabelecimentoapptalesb.model.domain.UsuarioDTO;

@Service
public class UsuarioService {

	@Autowired
	private EstabelecimentoClient estabelecimentoClient;

	public UsuarioDTO validar(UsuarioDTO dto) {
		return this.estabelecimentoClient.validar(dto);
	}

}
