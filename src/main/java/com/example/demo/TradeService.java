package com.example.demo;

import java.util.List;

/**
 * Interface exposing contract to handle Trades
 * 
 * @author Anuj Saraswat
 */
public interface TradeService {
	/**
	 * Deletes trades
	 */
	public void deleteAllTrade();

	/**
	 * Add new trade
	 * 
	 * @param tradeRequests
	 */
	public Trade addTrade(Trade tradeRequests);

	/**
	 * Return all existing trades from database associated with requested user id
	 * 
	 * @param userId UserId to search for in database
	 * @return All existing trades from database which have user id as requested
	 */
	public List<Trade> getAllTradesByUserId(long userId);

	public List<Trade> getAllTrades();

	public List<Trade> getAllTradesByStockSymbol(String stockSymbol);

}
