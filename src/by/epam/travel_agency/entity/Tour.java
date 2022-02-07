package by.epam.travel_agency.entity;

import java.util.Objects;

public class Tour {
	private String name;
	private String transport;
	private int numberOfDays;
	private int price;

	public Tour() {

	}

	public Tour(String name, String transport, int numberOfDays, int price) {
		this.name = name;
		this.transport = transport;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, numberOfDays, price, transport);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		return Objects.equals(name, other.name) && numberOfDays == other.numberOfDays && price == other.price
				&& Objects.equals(transport, other.transport);
	}

	@Override
	public String toString() {
		return name + ";" + transport + ";" + numberOfDays + ";" + price+";";
	}

}
