package com.example.demo.api;

import com.example.demo.data.Players;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")

public class Controller {
    @GetMapping("/{playerId}")
    public Players getPlayer(@PathVariable String playerId) {
        return new Players("Abdullah", playerId, 20);
    }

    @PostMapping("/create")
    public String createPlayer(@RequestBody Players players) {
        return "Player Created";
    }

    @PutMapping("/update")
    public String updatePlayer(@RequestBody Players players) {
        return "Player updated";
    }

    @DeleteMapping("/delete")
    public String deletePlayer(@RequestBody Players players) {
        return "Player deleted";
    }
}