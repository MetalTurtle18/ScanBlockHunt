package io.github.metalturtle18.scanblockhunt.util;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class Game {
    @Getter private final Player gameHost;
    @Getter private final HashMap<Player, GamePlayer> players = new HashMap<>();
    @Getter private Material currentItem;
    public boolean roundGoing;

    public Game(Player host) {
        gameHost = host;
        addPlayer(host);
        currentItem = null;
        roundGoing = false;
    }

    public void addPlayer(Player player) {
        players.put(player, new GamePlayer());
    }

    public void setItem(Material item) { // Probably need to add more stuff here
        currentItem = item;
        roundGoing = true;
    }

    public void itemFound(Player foundByPlayer) {
        roundGoing = false;
        players.get(foundByPlayer).increaseScore();
    }
}
