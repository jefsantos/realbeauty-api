
//http://www.ciceroednilson.com.br/desenvolvendo-uma-aplicacao-web-com-angular-4-e-spring-boot-parte-5-criando-os-acessos-ao-servico-rest/
//https://blog.algaworks.com/4-conceitos-sobre-rest-que-qualquer-desenvolvedor-precisa-conhecer/
package com.omelhordochile.repository;




import java.util.List;

import org.springframework.data.repository.Repository;

import com.omelhordochile.model.EmpresaModel;
 
public interface EmpresaRepository extends Repository<EmpresaModel, Integer> {
 
	void save(EmpresaModel empresa);
 
	void delete(EmpresaModel empresa);
 
	List<EmpresaModel> findAll();
 
	EmpresaModel findById(Integer id);
}