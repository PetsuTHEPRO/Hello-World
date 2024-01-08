package com.example.demo;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicial {
	
	@GetMapping("/")
	public Map<String,Object> home() {
		JSONObject jsonObject = JsonExample.createJson("Olá, Mundo!");
		return jsonObject.toMap();
	}

}
