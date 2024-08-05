package model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if(checkOut.isBefore(checkIn))
			throw new DomainException("A data de CheckIn não pode ser retroativa em relação a data de CheckOut");
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	//throws delega a função de tratar a exceção para quem invocar o método
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if(checkIn.isBefore(LocalDate.now()))
			throw new DomainException("A data de CheckIn deve ser futura.");
		
		if(checkOut.isBefore(LocalDate.now()))
			throw new DomainException("A data de CheckOut deve ser futura.");
			
		if(checkOut.isBefore(checkIn))
			throw new DomainException("A data de CheckIn não pode ser retroativa em relação a data de CheckOut");
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer duration() {
		return (int) ChronoUnit.DAYS.between(this.checkIn, this.checkOut);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation [roomNumber=");
		sb.append(roomNumber);
		sb.append(", checkIn=");
		sb.append(checkIn);
		sb.append(", checkOut=");
		sb.append(checkOut);
		sb.append(", duration=");
		sb.append(duration());
		sb.append("]");
		
		return sb.toString();
	}
	
}
