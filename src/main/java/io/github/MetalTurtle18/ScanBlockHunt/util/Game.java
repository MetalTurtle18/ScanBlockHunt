package io.github.MetalTurtle18.ScanBlockHunt.util;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Game {
    private final Player gameHost;
    @Getter private final ArrayList<GamePlayer> gamePlayers = new ArrayList<>();
    @Getter private final ArrayList<Player> players = new ArrayList<>();

    public Game(Player host) {
        gameHost = host;
        addPlayer(host);
    }

    public void addPlayer(Player player) {
        gamePlayers.add(new GamePlayer(player, this));
        players.add(player);
    }
}
