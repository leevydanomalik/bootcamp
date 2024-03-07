package com.bitozen.springboot.SpringBootRestWithH2;
import com.bitozen.springboot.SpringBootRestWithH2.model.Team;
import com.bitozen.springboot.SpringBootRestWithH2.service.teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@RestController
public class TeamController {
	@Autowired
	private teamService teamService;
	
	// Select, Insert, Delete, Update Operations for an Team
	
	@RequestMapping(value = "/team/{id}", method = RequestMethod.GET)
	Team getTeam(@PathVariable Integer id){
		return  teamService.findById(id).get();
	}
	
	@RequestMapping(value = "/team", method = RequestMethod.POST)
	String addTeam(@RequestBody Team team){
		Team savedTeam = teamService.save(team);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/team", method = RequestMethod.PUT)
	Team updateTeam(@RequestBody Team team){
		Team updatedTeam = teamService.save(team);
		return updatedTeam;
	}
	
	@RequestMapping(value = "/team", method = RequestMethod.DELETE)
	Map<String, String> deleteTeam(@RequestParam Integer id){
		Map<String, String> status = new HashMap<>();
		Optional<Team> team = teamService.findById(id);
		if(team.isPresent()) {
			teamService.delete(team.get());
			status.put("Status", "Teams deleted successfully");
		}
		else {
			status.put("Status", "Teams not exist");
		}
		return status;
	}
	
	// Select, Insert, Delete for List of Employees
	
	@RequestMapping(value = "/teams", method = RequestMethod.GET)
	List<Team> getAllTeam(){
		return teamService.findAll();
	}
	
	@RequestMapping(value = "/teams", method = RequestMethod.POST)
	String addAllTeams(@RequestBody List<Team> teamList){
		teamService.saveAll(teamList);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/teams", method = RequestMethod.DELETE)
	String addAllTeams(){
		teamService.deleteAll();
		return "SUCCESS";
	}
}
