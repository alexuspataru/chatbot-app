package utils;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;



public final class MenuUtils {
	
	public final static String START = "/start";
	public final static String MUSIC = "/music ";
	public final static String ANOTHER_MUSIC = "Another music";

	
	public static ReplyKeyboardMarkup showMenu() {
		final KeyboardButton Music = new KeyboardButton("Show music");
		
		
		final KeyboardButton[][] buttonsList = new KeyboardButton[1][2];
		buttonsList[0][0] = Music;
		
		
		final ReplyKeyboardMarkup replyKeyboard = new ReplyKeyboardMarkup(buttonsList);
		replyKeyboard.resizeKeyboard(true);
		replyKeyboard.oneTimeKeyboard(true);
		return replyKeyboard;
	}
	


}
