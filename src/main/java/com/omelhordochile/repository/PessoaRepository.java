
//http://www.ciceroednilson.com.br/desenvolvendo-uma-aplicacao-web-com-angular-4-e-spring-boot-parte-5-criando-os-acessos-ao-servico-rest/
//https://blog.algaworks.com/4-conceitos-sobre-rest-que-qualquer-desenvolvedor-precisa-conhecer/
package com.omelhordochile.repository;




import java.util.List;

import org.springframework.data.repository.Repository;

import com.omelhordochile.model.PessoaModel;
 
public interface PessoaRepository extends Repository<PessoaModel, Integer> {
 
	void save(PessoaModel pessoa);
 
	void delete(PessoaModel pessoa);
 
	List<PessoaModel> findAll();
 
	PessoaModel findById(Integer id);
}