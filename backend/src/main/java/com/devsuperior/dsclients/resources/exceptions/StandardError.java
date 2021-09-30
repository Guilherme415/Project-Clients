package com.devsuperior.dsclients.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Instant timpestamp;
	private Integer status;
	private String error;
	private String Message;
	private String pash;
	
	public StandardError() {
		
	}

	public Instant getTimpestamp() {
		return timpestamp;
	}

	public void setTimpestamp(Instant timpestamp) {
		this.timpestamp = timpestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getPash() {
		return pash;
	}

	public void setPash(String pash) {
		this.pash = pash;
	}
	
	
}
