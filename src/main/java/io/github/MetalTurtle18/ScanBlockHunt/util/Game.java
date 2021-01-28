package io.github.MetalTurtle18.ScanBlockHunt.util;

import lombok.Getter;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class Game {
    @Getter private final Player gameHost;
    @Getter private final HashMap<Player, GamePlayer> players = new HashMap<>();
    @Getter private Item currentItem;

    public Game(Player host) {
        gameHost = host;
        addPlayer(host);
        currentItem = null;
    }

    public void addPlayer(Player player) {
        players.put(player, new GamePlayer());
    }

    public void setItem(Item item) { // Probably need to add more stuff here
        currentItem = item;
    }

    public void itemFound(Player foundByPlayer) {
        currentItem = null;
        players.get(foundByPlayer).increaseScore();
    }
}
