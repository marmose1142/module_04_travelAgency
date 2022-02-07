package by.epam.travel_agency.entity;

import java.util.Objects;

public class ExcursionTour extends Tour {
	private String countries;

	public ExcursionTour() {

	}

	public ExcursionTour(String name, String transport, int numberOfDays, int price, String countries) {
		super(name, transport, numberOfDays, price);
		this.countries = countries;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(countries);
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
		ExcursionTour other = (ExcursionTour) obj;
		return Objects.equals(countries, other.countries);
	}

	@Override
	public String toString() {
		return "ExcursionTour [countries=" + countries + "]";
	}

}
