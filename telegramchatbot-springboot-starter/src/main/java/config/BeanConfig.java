package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pengrad.telegrambot.TelegramBot;

import handler.SimpleUpdateHandler;

@Configuration
@ComponentScan({"chatbot_starter"})
public class BeanConfig {
	
	/** The Constant LOGGER. */
	public static final Logger LOGGER = LogManager.getLogger();

	private static final String API_TOKEN = "583335521:AAHVM5XFjGPnIJViBjHRMRjHTIaZspTdhOg";

	@Autowired
	private SimpleUpdateHandler updateHandler;
	
	@Bean
	public CommandLineRunner runTelegramBoot() {
		return (args) -> {
			TelegramBot bot = getTelegramBot();
			bot.setUpdatesListener(updateHandler);
		};
	}

	@Bean
	public TelegramBot getTelegramBot() {
		TelegramBot bot = new TelegramBot(API_TOKEN);
		return  bot;
	}
}
