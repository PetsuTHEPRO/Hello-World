package com.example.demo;

import org.json.JSONObject;

public class JsonExample {

	public static JSONObject createJson(String mensagem) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("mensagem", mensagem);
        return jsonObject;
    }
}
