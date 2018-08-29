package ro.vladfernoaga.telegram_chatbot_starter.service;

//package service;

import chatbot_starter.dto.MusicDto;
import ro.unitbv.eduassistant.dto.QuestionDto;

public interface MusicService {

	void createMusic(MusicDto musicDto);
	
	String createMusic(Long musicId);
	
	void addQuestion(QuestionDto questionDto, long lessonId);
}

