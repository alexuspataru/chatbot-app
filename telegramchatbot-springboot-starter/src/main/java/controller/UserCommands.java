package controller;

import service.AnotherMusicButtonAction;
import service.MessageCommandAction;
import service.MusicCommandAction;
import service.StartCommandAction;
import service.UnknownCommandAction;;



public enum UserCommands {

	UNKNOWN_COMMAND("", new UnknownCommandAction()),
	START_COMMAND("/start", new StartCommandAction()),
	MUSIC_COMMAND("/music ", new MusicCommandAction()),
	ANOTHER_MUSIC_COMMAND("Another music  information", new AnotherMusicButtonAction());



	private String commandText;
	private MessageCommandAction<?> action;

	private UserCommands(String commandText, MessageCommandAction<?> action) {
		this.commandText = commandText;
		this.action = action;
	}

	public String getCommandText() {
		return commandText;
	}

	public MessageCommandAction<?> getAction() {
		return action;
	}
	
	
}
