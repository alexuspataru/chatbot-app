package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.MusicModel;

public interface MusicRepo extends JpaRepository<MusicModel, String> {
		
	MusicModel findMusicByTitle(String title);
		
	}

