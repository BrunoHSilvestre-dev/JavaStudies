package entities;

public class Comment {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Comment(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Comment [text=");
		sb.append(text);
		sb.append("]");
		
		return sb.toString();
//		return "Comment [text=" + text + "]";
	}
}
