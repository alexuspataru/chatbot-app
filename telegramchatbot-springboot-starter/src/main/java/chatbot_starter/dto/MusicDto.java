package chatbot_starter.dto;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicDto {

	private long id;
	public String title;
	public String year;
	public String genre;
	public String songwriter;
	public String artist;
	public String length;
}

