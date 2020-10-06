package io.github.MetalTurtle18.ScanBlockHunt.commands;

public abstract class CommandTemplate {

    private String commandName;

    public String getCommandName() {
        return commandName;
    }

    public void execute(String[] args) { }
}
