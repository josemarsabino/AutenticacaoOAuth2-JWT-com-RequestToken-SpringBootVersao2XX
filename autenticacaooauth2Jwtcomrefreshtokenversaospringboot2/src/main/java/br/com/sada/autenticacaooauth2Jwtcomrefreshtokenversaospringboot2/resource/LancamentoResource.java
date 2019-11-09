package br.com.sada.autenticacaooauth2Jwtcomrefreshtokenversaospringboot2.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String testeApiRestLancamento() {
		return "Api Rest respondendo Ok. UTILIZANDO AUTENTICAÇÃOCOM REFRESH TOKEN";
	}

}
