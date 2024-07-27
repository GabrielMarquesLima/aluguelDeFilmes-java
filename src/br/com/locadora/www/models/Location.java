package br.com.locadora.www.models;

public class Location {
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;

    public Location(TranslateViaCep translateViaCep, int numero){
        this.cep = translateViaCep.cep();
        this.logradouro = translateViaCep.logradouro();
        this.bairro = translateViaCep.bairro();
        this.cidade = translateViaCep.localidade();
        this.estado = translateViaCep.uf();
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format(
                "Endereço:\n" +
                        "CEP: %s\n" +
                        "Logradouro: %s\n" +
                        "Número: %d\n" +
                        "Bairro: %s\n" +
                        "Cidade: %s\n" +
                        "Estado: %s",
                cep, logradouro, numero, bairro, cidade, estado
        );
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
