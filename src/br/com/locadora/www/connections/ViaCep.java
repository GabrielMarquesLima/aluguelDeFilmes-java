package br.com.locadora.www.connections;

import br.com.locadora.www.models.Location;
import br.com.locadora.www.models.TranslateViaCep;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCep {

    HttpClient client = HttpClient.newHttpClient();

    public TranslateViaCep searchLocation (String value){

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + value + "/json"))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            TranslateViaCep translateViaCep = new Gson().fromJson(response.body(), TranslateViaCep.class);

            return new Gson().fromJson(response.body(), TranslateViaCep.class);

        } catch (Exception e){
            throw new RuntimeException("The content not exist.");
        }
    }
}
