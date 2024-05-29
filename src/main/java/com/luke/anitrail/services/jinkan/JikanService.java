package com.luke.anitrail.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JikanService {
    private final URI endpoint = URI.create("https://api.jikan.moe/v4/anime?q=");

    public String requestData(String title) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint + title.replace(" ", "%20").toLowerCase()))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
