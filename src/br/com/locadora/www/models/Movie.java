package br.com.locadora.www.models;

public class Movie {
    private String name;
    private String year;
    private String runtime;
    private String genre;
    private String language;

    public Movie(String name, String release, String runtime, String genre, String language) {
        this.name = name;
        this.year = release;
        this.runtime = runtime;
        this.genre = genre;
        this.language = language;
    }

    public Movie() {
    }

    public Movie(TranslateOmdb translateOmdb) {
        this.name = translateOmdb.Title();
        this.year = translateOmdb.Year();
        this.runtime = translateOmdb.Runtime();
        this.genre = translateOmdb.Genre();
        this.language = translateOmdb.Language();
    }

    @Override
    public String toString() {
        return String.format("Filme:\n" +
                        "Nome: %s\n" +
                        "Ano: %s\n" +
                        "Duração: %s\n" +
                        "Gênero: %s\n" +
                        "Idioma: %s",
                name, year, runtime, genre, language);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
