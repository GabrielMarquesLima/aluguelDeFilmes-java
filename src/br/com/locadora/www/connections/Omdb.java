package br.com.locadora.www.connections;

import br.com.locadora.www.models.Movie;
import br.com.locadora.www.models.TranslateOmdb;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Omdb {
    HttpClient client = HttpClient.newHttpClient();

    public TranslateOmdb searchOMDB (String value){
        //Here I am doing one request in api OMDB, for it I to spend one String as parameter, this String means the film or serie.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=" + value + "&apikey=b9757f1a"))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            TranslateOmdb translateOmdb = new Gson().fromJson(response.body(), TranslateOmdb.class);

            Movie movie = new Movie(translateOmdb);

            return new Gson().fromJson(response.body(), TranslateOmdb.class);

        } catch (Exception e){
            throw new RuntimeException("The content not exist.");
        }

    }


}
