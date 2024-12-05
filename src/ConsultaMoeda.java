import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moeda buscaMoeda(String moedaBase, String moedaTarget){
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/209471a73529e496c243ccbb/pair/"+moedaBase+"/"+moedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não identifiquei a moeda mencionada!");
        }

    }

}
