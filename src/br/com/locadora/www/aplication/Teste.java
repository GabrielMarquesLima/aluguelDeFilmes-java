package br.com.locadora.www.aplication;

import br.com.locadora.www.connections.Omdb;
import br.com.locadora.www.connections.ViaCep;
import br.com.locadora.www.functions.FileGenerator;
import br.com.locadora.www.models.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Teste {
    static Set<String> movieList = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Omdb apiOmdb = new Omdb();
        ViaCep apiViaCep = new ViaCep();
        boolean decision = true;



        Movie movie = new Movie(apiOmdb.searchOMDB("Matrix"));
        movieList.add(movie.getName());
        Movie movie1 = new Movie(apiOmdb.searchOMDB("Dogville"));
        movieList.add(movie1.getName());

        Location location = new Location(apiViaCep.searchLocation("08557760"), 45);

        Client client = new Client("12345678912", "Gabriel", location);



        Sale sale = new Sale(1, client, 10.00, movieList);
        System.out.println(sale);
        FileGenerator fileGenerator = new FileGenerator();
        fileGenerator.fileGenerator(sale);

    }

    public static Set<String> getMovieList() {
        return movieList;
    }

    public static void setMovieList(Set<String> movieList) {
        Teste.movieList = movieList;
    }
}
