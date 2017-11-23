package br.com.unipe.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TesteE {

	public static void main(String[] args) {

		WsConsumer ws = new WsConsumer();

		try {
			String response = ws.sendGet("http://localhost:8080/evento");
			
			Gson gson = new Gson();

			Evento evento = gson.fromJson(response, new TypeToken<Evento>(){}.getType());
			
			System.out.println(evento.getLocal());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
