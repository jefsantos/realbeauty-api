
//http://www.ciceroednilson.com.br/desenvolvendo-uma-aplicacao-web-com-angular-4-e-spring-boot-parte-5-criando-os-acessos-ao-servico-rest/
//https://blog.algaworks.com/4-conceitos-sobre-rest-que-qualquer-desenvolvedor-precisa-conhecer/
package com.omelhordochile.repository;




import java.util.List;

import org.springframework.data.repository.Repository;

import com.omelhordochile.model.CarroModel;
 
public interface CarroRepository extends Repository<CarroModel, Integer> {
 
	void save(CarroModel carro);
 
	void delete(CarroModel carro);
 
	List<CarroModel> findAll();
 
	CarroModel findById(Integer id);
}