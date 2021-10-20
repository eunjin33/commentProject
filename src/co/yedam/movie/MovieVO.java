package co.yedam.movie;

public class MovieVO {
	
	private int movieId;
	private String poster;
	private String title;
	private String genre;
	private String openingD;
	private String contentM;
	
	public MovieVO(int movieId, String poster, String title, String genre, String openingD, String contentM) {
		super();
		this.movieId = movieId;
		this.poster = poster;
		this.title = title;
		this.genre = genre;
		this.openingD = openingD;
		this.contentM = contentM;
	}
	
	

	public MovieVO() {
		super();
	}




	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getOpeningD() {
		return openingD;
	}
	public void setOpeningD(String openingD) {
		this.openingD = openingD;
	}
	public String getContentM() {
		return contentM;
	}
	public void setContentM(String contentM) {
		this.contentM = contentM;
	}
	
	
	
}
