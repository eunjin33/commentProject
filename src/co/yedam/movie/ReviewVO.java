package co.yedam.movie;

public class ReviewVO {

	private String postingId;
	private String coment;
	private String grade;

	public String getPostingId() {
		return postingId;
	}

	public void setPostingId(String postingId) {
		this.postingId = postingId;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ReviewVO [postingId=" + postingId + ", coment=" + coment + ", grade=" + grade + ", toString()="
				+ super.toString() + "]";
	}

}
