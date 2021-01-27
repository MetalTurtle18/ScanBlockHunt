package io.github.MetalTurtle18.ScanBlockHunt.util;

import java.util.ArrayList;

public class Game {
    private ArrayList<GamePlayer> gamePlayers = new ArrayList<>();

    public Game() {

    }

    public void addPlayer(GamePlayer player) {
        gamePlayers.add(player);
    }
}
