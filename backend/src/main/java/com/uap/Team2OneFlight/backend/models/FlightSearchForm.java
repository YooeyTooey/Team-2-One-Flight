package com.uap.Team2OneFlight.backend.models;

public class FlightSearchForm {
	private String originLocationCode;
	private String destinationLocationCode;
	private String departureDate;
	private String returnDate;
	private int adults;
	private int max;
	
	
	public String getOriginLocationCode() {
		return originLocationCode;
	}
	public void setOriginLocationCode(String originLocationCode) {
		this.originLocationCode = originLocationCode;
	}
	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}
	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
}
