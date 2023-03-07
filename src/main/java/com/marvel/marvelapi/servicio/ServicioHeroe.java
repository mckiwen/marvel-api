package com.marvel.marvelapi.servicio;

import com.marvel.marvelapi.modelo.Heroe;
import com.marvel.marvelapi.repositorio.RepositorioHeroe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServicioHeroe {
    /*
    @Value("${marvel.publicKey}")
    private String publicKey;

    @Value("${marvel.privateKey}")
    private String privateKey;

    private final RestTemplate restTemplate;
    private final RepositorioHeroe repositorioHeroe;

    public ServicioHeroe(RestTemplate restTemplate, RepositorioHeroe repositorioHeroe) {
        this.restTemplate = restTemplate;
        this.repositorioHeroe = repositorioHeroe;
    }


    public void descargaHeroes() {
        String url = "https://gateway.marvel.com/v1/public/characters?ts=1&apikey=%s&hash=%s";
        //String timestamp = String.valueOf(new Date().getTime());
        String timestamp = "1";
        String hash = DigestUtils.md5Hex(timestamp + privateKey + publicKey);

        String finalUrl = String.format(url, publicKey, hash);

        //MarvelResponse response = restTemplate.getForObject(finalUrl, MarvelResponse.class);
        //List<Heroe> heroes = response.getResults().stream().map(HeroMapper::toHero).collect(Collectors.toList());
        //repositorioHeroe.saveAll(heroes);
    }

     */
}
