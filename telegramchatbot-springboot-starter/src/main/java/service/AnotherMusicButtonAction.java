package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import ro.vladfernoaga.telegram_chatbot_starter.dao.MessageDao;


@Service
public class AnotherMusicButtonAction  implements MessageCommandAction<Void>{
	
	@Autowired
	private MessageDao messageDAO;
	
	@Override
	public Void execute(TelegramBot bot, Message message) {
		
		final Integer chatId = message.from().id();
		final Integer messageId = message.messageId();
		
		final SendMessage botResponse = new SendMessage(chatId, String.format(messageDAO.getMessage("mainMenu")))
				.parseMode(ParseMode.HTML).disableNotification(false).replyToMessageId(messageId);
		
		bot.execute(botResponse);
		
		return null;
	}

}
