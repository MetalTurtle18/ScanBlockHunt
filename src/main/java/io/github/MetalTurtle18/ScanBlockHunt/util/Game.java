package io.github.MetalTurtle18.ScanBlockHunt.util;

import lombok.Getter;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Game {
    @Getter private final Player gameHost;
    @Getter private final ArrayList<GamePlayer> gamePlayers = new ArrayList<>();
    @Getter private final ArrayList<Player> players = new ArrayList<>();
    @Getter private Item currentItem;

    public Game(Player host) {
        gameHost = host;
        addPlayer(host);
        currentItem = null;
    }

    public void addPlayer(Player player) {
        gamePlayers.add(new GamePlayer(player, this));
        players.add(player);
    }

    public void setItem(Item item) { // Probably need to add more stuff here
        currentItem = item;
    }
}
