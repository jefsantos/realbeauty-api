
//http://www.ciceroednilson.com.br/desenvolvendo-uma-aplicacao-web-com-angular-4-e-spring-boot-parte-5-criando-os-acessos-ao-servico-rest/
//https://blog.algaworks.com/4-conceitos-sobre-rest-que-qualquer-desenvolvedor-precisa-conhecer/
package com.omelhordochile.repository;




import java.util.List;

import org.springframework.data.repository.Repository;

import com.omelhordochile.model.PasseioModel;
import com.omelhordochile.model.PessoaModel;
 
public interface PasseioRepository extends Repository<PasseioModel, Integer> {
 
	void save(PasseioModel passeio);
 
	void delete(PasseioModel passeio);
 
	List<PasseioModel> findAll();
 
	PasseioModel findById(Integer id);
}