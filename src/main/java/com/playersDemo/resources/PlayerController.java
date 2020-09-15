package com.playersDemo.resources;

import com.playersDemo.domain.Player;
import com.playersDemo.exception.PlayerNotFoundException;
import com.playersDemo.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/api/players")
    @ResponseStatus(value = HttpStatus.OK, code = HttpStatus.OK)
    public List<Player> retrieveAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping("/api/players/{playerID}")
    public Player retrieveAllDocuments(@PathVariable String playerID) {
        Optional<Player> player = playerRepository.findById(playerID);
        if (!player.isPresent()) {
            throw new PlayerNotFoundException("Player not found" + playerID);
        }
        return player.get();
    }

}
