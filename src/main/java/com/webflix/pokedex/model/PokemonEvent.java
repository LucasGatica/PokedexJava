package com.webflix.pokedex.model;

import java.util.Objects;

public class PokemonEvent {
	
	
	private Long eventId;
	private String eventType;
	
	
	
	public PokemonEvent(Long eventId, String eventType) {
		
		this.eventId = eventId;
		this.eventType = eventType;
	}
	
	
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}


	@Override
	public int hashCode() {
		return Objects.hash(eventId, eventType);
	}


	@Override
	public String toString() {
		return "PokemonEvent [eventId=" + eventId + ", eventType=" + eventType + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonEvent other = (PokemonEvent) obj;
		return Objects.equals(eventId, other.eventId) && Objects.equals(eventType, other.eventType);
	}
	
	
}
