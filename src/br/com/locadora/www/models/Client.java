package br.com.locadora.www.models;

public class Client {
    private String cpf;
    private String name;
    private Location location;

    public Client (String cpf, String name, Location location) {
        this.cpf = cpf;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format(
                "Pessoa:\n" +
                        "CPF: %s\n" +
                        "Nome: %s\n" +
                        "Localização:\n%s",
                cpf, name, location);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
