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

import com.omelhordochile.model.EmpresaModel;
import com.omelhordochile.model.ResponseModel;
import com.omelhordochile.repository.EmpresaRepository;

@RestController
@RequestMapping("/service")
public class EmpresaService {
	@Autowired
	private EmpresaRepository empresaRepository;

	
	
	

		
		
	//inserir novo passeio
	@RequestMapping(value = "/empresa", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody EmpresaModel empresa) {
		try {
			this.empresaRepository.save(empresa);
			return new ResponseModel(0, "Salvo com Sucesso");
		} catch (Exception e) {
			return new ResponseModel(0, e.getMessage());
		}

	}

	//atualizar novo
	@RequestMapping(value = "/empresa", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody EmpresaModel empresa) {

		try {
			this.empresaRepository.save(empresa);

			return new ResponseModel(0, "Salvo com sucesso");
		} catch (Exception e) {
			return new ResponseModel(0, e.getMessage());
		}

	}

	//Selecionar todos Os Passeios
	@RequestMapping(value = "/empresa", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<Object> consultar() {
		

		return new ResponseEntity<>(this.empresaRepository.findAll(), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/empresa/{id_empresa}", method =RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody EmpresaModel buscar(@PathVariable("id_empresa") Integer id_empresa) {
		
		return this.empresaRepository.findById(id_empresa);
	}
	
	
	@RequestMapping(value = "/empresa/{id_empresa}", method =RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ ResponseBody ResponseModel deletar (@PathVariable("id_empresa") Integer id_empresa) {
		 EmpresaModel EmpresaModel = empresaRepository.findById(id_empresa);
		 try {
			 
			 empresaRepository.delete(EmpresaModel);
			 
			 return new ResponseModel(1, "Registro deletado");
			 
		 }catch (Exception e) {
			
			 return new ResponseModel(0, e.getMessage());
		}
	}
		
	
	

	
	}


