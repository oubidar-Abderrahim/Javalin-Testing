package javalintesting.entities;

import java.io.Serializable;

public class Song implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String artiste;
	private String[] featuring;
	private int year;
	private String genre;
	private String[] otherGenres;
	private int lengthInSeconds;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtiste() {
		return artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public String[] getFeaturing() {
		return featuring;
	}

	public void setFeaturing(String[] featuring) {
		this.featuring = featuring;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String[] getOtherGenres() {
		return otherGenres;
	}

	public void setOtherGenres(String[] otherGenres) {
		this.otherGenres = otherGenres;
	}

	public int getLengthInSeconds() {
		return lengthInSeconds;
	}

	public void setLengthInSeconds(int lengthInSeconds) {
		this.lengthInSeconds = lengthInSeconds;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Song() {
		super();
	}

}
