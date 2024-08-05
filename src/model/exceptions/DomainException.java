package model.exceptions;

//extends Exception o compilador exige que seja tratada com try catch
//extends RuntimeException não pois é executada em "tempo de execução"

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
}
