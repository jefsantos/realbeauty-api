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

import com.omelhordochile.model.PasseioModel;
import com.omelhordochile.model.ResponseModel;
import com.omelhordochile.repository.PasseioRepository;

@RestController
@RequestMapping("/service")
public class PasseioService {
	@Autowired
	private PasseioRepository passeioRepository;

	
	//inserir novo passeio
	@RequestMapping(value = "/passeio", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody PasseioModel passeio) {
		try {
			this.passeioRepository.save(passeio);
			return new ResponseModel(0, "Salvo com Sucesso");
		} catch (Exception e) {
			return new ResponseModel(0, e.getMessage());
		}

	}

	//atualizar novo
	@RequestMapping(value = "/passeio", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody PasseioModel passeio) {

		try {
			this.passeioRepository.save(passeio);

			return new ResponseModel(0, "Salvo com sucesso");
		} catch (Exception e) {
			return new ResponseModel(0, e.getMessage());
		}

	}

	//Selecionar todos Os Passeios
	@RequestMapping(value = "/passeio", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<Object> consultar() {
		

		return new ResponseEntity<>(this.passeioRepository.findAll(), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/passeio/{id}", method =RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody PasseioModel buscar(@PathVariable("id") Integer id) {
		
		return this.passeioRepository.findById(id);
	}
	
	
	@RequestMapping(value = "/passeio/{id}", method =RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ ResponseBody ResponseModel deletar (@PathVariable("id") Integer id) {
		 PasseioModel passeioModel = passeioRepository.findById(id);
		 try {
			 
			 passeioRepository.delete(passeioModel);
			 
			 return new ResponseModel(1, "Registro deletado");
			 
		 }catch (Exception e) {
			
			 return new ResponseModel(0, e.getMessage());
		}
	}
		
	
	

	
	}


