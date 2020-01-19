package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/")
public class TradeController {

	@Autowired
	TradeService TradeService;

	@ApiOperation(value = "Returns list of trades", notes = "Gets a list of all meetings scheduled by a specific user", response = Trade.class, tags = {
			"Get all Trades" })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully returned list of trades", response = Trade.class, responseContainer = "List"),
			@ApiResponse(code = 401, message = "Request not authorised"),
			@ApiResponse(code = 403, message = "Request forbidden by server"),
			@ApiResponse(code = 500, message = "Internal Server Error. Server could not process the request") })
	@RequestMapping(value = "/trades", method = RequestMethod.GET)
	public List<Trade> getAllTrades() {
		System.out.println("Inside getAllTrades ->> ");
		List<Trade> trades = TradeService.getAllTrades();
		return trades;
	}

	@ApiOperation(value = "Create a trade", notes = "Creates a trade", response = Trade.class, tags = {"Create a Trade" })
	@RequestMapping(value = "/trades", method = RequestMethod.POST)
	public ResponseEntity<Void> addTrade(@RequestBody Trade trade) {

		System.out.println("Inside add trade method ->> ");
		ResponseEntity<Void> response = null;

		Trade resultTrade = TradeService.addTrade(trade);

		final URI tradeURI = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/trade/{tradeId}").build()
				.expand(trade.getUser()).toUri();

		final HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setLocation(tradeURI);
		response = new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);

		return response;

	}

}
