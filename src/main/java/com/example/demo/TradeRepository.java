package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TradeRepository extends CrudRepository<Trade, Long> {

	List<Trade> findBySymbol(String symbol);
	Optional<Trade> findById(Long id);
}
