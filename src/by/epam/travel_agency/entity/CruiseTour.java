package by.epam.travel_agency.entity;

import java.util.Objects;

public class CruiseTour extends Tour {
	private String countries;
	private String food;

	public CruiseTour() {

	}

	public CruiseTour(String name, String transport, int numberOfDays, int price, String countries, String food) {
		super(name, transport, numberOfDays, price);
		this.countries = countries;
		this.food = food;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(countries, food);
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
		CruiseTour other = (CruiseTour) obj;
		return Objects.equals(countries, other.countries) && Objects.equals(food, other.food);
	}

	@Override
	public String toString() {
		return super.toString()+ countries + ";" + food + ";";
	}

}
