package com.omelhordochile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.omelhordochile.model.CarroModel;
import com.omelhordochile.model.ResponseModel;
import com.omelhordochile.repository.CarroRepository;
 

 
@RestController
@RequestMapping("/service")
public class CarroService {
 
	@Autowired
	private CarroRepository carroRepository; 
 
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param carro
	 * @return
	 */
	@RequestMapping(value="/carro", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody CarroModel carro){
 
 
		try {
 
			this.carroRepository.save(carro);
 
		
			return new ResponseModel(1,"Registro salvo com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());			
		}
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UMA PESSOA
	 * @param carro
	 * @return
	 */
	@RequestMapping(value="/carro", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody CarroModel carro){
 
		try {
 
			this.carroRepository.save(carro);		
 
			return new ResponseModel(1,"Registro atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage() );
		}
	}
 
	/**
	 * CONSULTAR TODAS AS PESSOAS
	 * @return
	 */
	@RequestMapping(value="/carro", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<Object> consultar(){
		
		return new ResponseEntity<>(this.carroRepository.findAll(), HttpStatus.OK);
	}
 
	/**
	 * BUSCAR UMA PESSOA PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/carro/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody CarroModel buscar(@PathVariable("codigo") Integer codigo){
 
		return this.carroRepository.findById(codigo);
	}
	
 
	/***
	 * EXCLUIR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/carro/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Integer codigo){
 
		CarroModel CarroModel = carroRepository.findById(codigo);
 
		try {
 
			carroRepository.delete(CarroModel);
 
			return new ResponseModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
 
}