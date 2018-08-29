package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MusicDetails {
    @JsonProperty("title")
	public String title;
	public String year;
	public String genre;
	public String songwriter;
	public String artist;
	public String length;
}
