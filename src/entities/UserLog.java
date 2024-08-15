package entities;

import java.time.Instant;
import java.util.Objects;

public class UserLog {
	private String user;
	private Instant accessDateTime;
	
	public UserLog(String user, Instant accessDateTime) {
		super();
		this.user = user;
		this.accessDateTime = accessDateTime;
	}
	
	public String getUser() {
		return user;
	}
	public Instant getAccessDateTime() {
		return accessDateTime;
	}

	@Override
	public String toString() {
		return "UserLog [user=" + user + ", accessDateTime=" + accessDateTime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLog other = (UserLog) obj;
		return Objects.equals(user, other.user);
	}
}
