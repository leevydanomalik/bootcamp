package com.bitozen.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Barcelona;
import com.bitozen.springboot.SpringBootRestWithH2.model.Game;
import com.bitozen.springboot.SpringBootRestWithH2.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class GameController {
	@Autowired
	private GameService gameService;
	
	@RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
	Game getGame(@PathVariable Integer id){
		return  gameService.findById(id).get();
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.POST)
	String addGame(@RequestBody Game game){
		Game savedGame = gameService.save(game);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.PUT)
	Game updateGame(@RequestBody Game game){
		Game updatedGame = gameService.save(game);
		return updatedGame;
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.DELETE)
	Map<String, String> deleteGame(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Game> game = gameService.findById(id);
		if(game.isPresent()) {
			gameService.delete(game.get());
			status.put("Status", "Data deleted successfully");
		}
		else {
			status.put("Status", "Data not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/games", method = RequestMethod.GET)
	List<Game> getAllGame(){
		return gameService.findAll();
	}
	
	@RequestMapping(value = "/games", method = RequestMethod.POST)
	String addAllGame(@RequestBody List<Game> gameList){
		gameService.saveAll(gameList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/games", method = RequestMethod.DELETE)
	String addAllGames(){
		gameService.deleteAll();
		return "SUCCESS";
	}
}
