package com.webflix.pokedex.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.webflix.pokedex.model.Pokemon;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String>{

}
