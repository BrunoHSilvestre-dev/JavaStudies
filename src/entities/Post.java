package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Post [moment=");
		sb.append(moment);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", likes=");
		sb.append(likes);
		sb.append(", comments");
		sb.append(comments);
		sb.append("]");
		
		return sb.toString();
		
//		return "Post [moment=" + moment + ", title=" + title + ", content=" + content + ", likes=" + likes
//				+ ", comments=" + comments + "]";
	}

	public Post AddComment(Comment comment) {
		comments.add(comment);
		return this;
	}
	
	public Post RemoveComment(Comment comment) {
		comments.remove(comment);
		return this;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
}
