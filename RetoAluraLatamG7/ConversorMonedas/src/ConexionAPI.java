import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {
    public Moneda consultaMoneda(String currency){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e19c1c7321ebede283aaee17/latest/"+currency);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Moneda no manejada o invalida");
        }
    }
}
