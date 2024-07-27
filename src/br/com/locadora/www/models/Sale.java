package br.com.locadora.www.models;

import br.com.locadora.www.aplication.Teste;

import java.util.Set;

public class Sale {
    transient private Teste test = new Teste();

    private int id;
    private Client client;
    private double price;
    private Set product = test.getMovieList();

    public Sale(int id, Client client, double price, Set product) {
        this.id = id;
        this.client = client;
        this.price = price;
        this.product = product;
    }

    @Override
    public String toString() {

        return String.format(
                "Venda:\n" +
                        "ID: %d\n" +
                        "Cliente:\n\n%s\n" +
                        "Preço: %.2f\n" +
                        "Produtos:\n\n%s",
                id, client.toString(), price, product
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set getProduct() {
        return product;
    }

    public void setProduct(Set product) {
        this.product = product;
    }
}
