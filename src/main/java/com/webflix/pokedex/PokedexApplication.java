package com.webflix.pokedex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import com.webflix.pokedex.repository.*;

import reactor.core.publisher.Flux;

import com.webflix.pokedex.model.*;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}
		
		@Bean
		CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository) {
		return args ->{
			Flux<Pokemon> pokemonFlux = Flux.just(
					new Pokemon (null, "bulbasur", "grama", "grandeza", 9.0),
					new Pokemon (null, "lupa", "gramate", "granetedeza", 9.0),
					new Pokemon (null, "Caterpie", "Minhoca", "poeira", 9.0)).flatMap(repository::save);
		
			pokemonFlux
						.thenMany(repository.findAll())
						.subscribe(System.out::println);
			
	};
	}

}
