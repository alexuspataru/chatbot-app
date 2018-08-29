package model;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	/**
	 * This is the entity class for the Advice table
	 * 
	 * @author stan4
	 *
	 */
	@Entity
	@Table(name = "music", schema = "public")
	public class MusicModel {
		
		@Override
		public String toString() {
			return "MusicModel [id=" + id + ", title=" + title + ", year=" + year
					+ ", genre=" + genre + ", songwriter=" + songwriter + ", artist=" + artist + ", length=" + length + "]";
		}

		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name = "TITLE", unique = true)
		private String title;
		
		@Column(name = "YEAR", unique = true)
		private String year;
		
		@Column(name = "GENRE", unique = true)
		private String genre;
		
		@Column(name = "SONGWRITER", unique = true)
		private String songwriter;
		
		@Column(name = "ARTIST", unique = true)
		private String artist;
		
		@Column(name = "LENGTH", unique = true)
		private String length;
		
		

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getYear() {
			return year;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getSongwriter() {
			return songwriter;
		}

		public void setSongwriter(String songwriter) {
			this.songwriter = songwriter;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getLength() {
			return length;
		}

		public void setLength(String length) {
			this.length = length;
		}
		
	}