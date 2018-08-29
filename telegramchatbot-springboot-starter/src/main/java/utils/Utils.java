package utils;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;

public final class Utils {

	// Define the token (key) for the various API(s) utilized throughout this
	// project
	public static final String BOT_API_TOKEN = "583335521:AAHVM5XFjGPnIJViBjHRMRjHTIaZspTdhOg";
	


	public final static String START = "/start";
	public final static String MUSIC = "/music ";
	public final static String ANOTHER_MUSIC= "Another music";




	
	public static ReplyKeyboardMarkup showForecastMenu() {
		final KeyboardButton Music = new KeyboardButton("Show music");
		

		final KeyboardButton[][] buttonsList = new KeyboardButton[1][2];
		buttonsList[0][0] = Music;
	

		final ReplyKeyboardMarkup replyKeyboard = new ReplyKeyboardMarkup(buttonsList);
		replyKeyboard.resizeKeyboard(true);
		replyKeyboard.oneTimeKeyboard(true);
		return replyKeyboard;
	}

	
	
}
