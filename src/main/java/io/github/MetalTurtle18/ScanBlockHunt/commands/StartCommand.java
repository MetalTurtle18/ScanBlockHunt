package io.github.MetalTurtle18.ScanBlockHunt.commands;

import io.github.MetalTurtle18.ScanBlockHunt.ScanBlockHunt;
import io.github.MetalTurtle18.ScanBlockHunt.util.Game;

public class StartCommand {
    public static void start(String[] args) {
        ScanBlockHunt.runningGame = new Game();
    }
}
