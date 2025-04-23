package ru.netology.dto.response;

/**
 * @author Aleksandr Polochkin 20.04.2023
 */

public class ExceptionRS {

	private String message;
	private Integer id;

	public ExceptionRS(String message, Integer id) {
		this.message = message;
		this.id = id;
	}

}