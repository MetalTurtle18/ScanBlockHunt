package io.github.MetalTurtle18.ScanBlockHunt.util;

import org.bukkit.entity.Player;

public class GamePlayer {

    private final Player player;
    private final Game game;

    public GamePlayer(Player player, Game game) {
        this.player = player;
        this.game = game;
    }
}
