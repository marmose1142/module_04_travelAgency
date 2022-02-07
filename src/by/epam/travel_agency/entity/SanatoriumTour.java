package by.epam.travel_agency.entity;

import java.util.Objects;

public class SanatoriumTour extends Tour {
	private String food;

	public SanatoriumTour() {

	}

	public SanatoriumTour(String name, String transport, int numberOfDays, int price, String food) {
		super(name, transport, numberOfDays, price);
		this.food = food;

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
		result = prime * result + Objects.hash(food);
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
		SanatoriumTour other = (SanatoriumTour) obj;
		return Objects.equals(food, other.food);
	}

	@Override
	public String toString() {
		return "SanatoriumTour [food=" + food + "]";
	}

}
