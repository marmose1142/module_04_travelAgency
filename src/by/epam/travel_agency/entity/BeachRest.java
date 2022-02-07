package by.epam.travel_agency.entity;

import java.util.Objects;

public class BeachRest extends Tour {
	private String food;
	private String country;

	public BeachRest() {

	}

	public BeachRest(String name, String transport, int numberOfDays, int price, String food, String country) {
		super(name, transport, numberOfDays, price);
		this.country = country;
		this.food = food;

	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(country, food);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeachRest other = (BeachRest) obj;
		return Objects.equals(country, other.country) && Objects.equals(food, other.food);
	}

	@Override
	public String toString() {
		return "BeachRest [food=" + food + ", country=" + country + "]";
	}

}
