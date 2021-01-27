package io.github.MetalTurtle18.ScanBlockHunt.util;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Game {
    private final Player gameHost;
    private final ArrayList<GamePlayer> gamePlayers = new ArrayList<>();

    public Game(Player host) {
        gameHost = host;
        addPlayer(host);
    }

    public void addPlayer(Player player) {
        gamePlayers.add(new GamePlayer(player, this));
    }
}
