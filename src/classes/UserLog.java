package classes;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserLog {
	private String name;
	private LocalDateTime time;
	
	public UserLog(String name, LocalDateTime time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getTime() {
		return time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
}
