package io.github.MetalTurtle18.ScanBlockHunt.util;

import java.util.ArrayList;

public class Game {
    public ArrayList<GamePlayer> gamePlayers;

    public Game() {

    }

    public void addPlayer(String UUID) {
        gamePlayers.add(new GamePlayer(UUID));
    }

}
