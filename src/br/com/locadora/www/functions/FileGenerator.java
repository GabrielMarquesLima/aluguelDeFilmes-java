package br.com.locadora.www.functions;

import br.com.locadora.www.models.Sale;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    
    public void fileGenerator(Sale sale) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter file = new FileWriter(sale.getId() + ".json");
        file.write(gson.toJson(sale));
        file.close();
    }
}
