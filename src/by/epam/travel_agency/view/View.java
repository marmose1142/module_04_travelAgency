package by.epam.travel_agency.view;

import by.epam.travel_agency.entity.Tour;
import by.epam.travel_agency.entity.TourList;

public class View {
	public void printTourList(TourList tourlist) {
		System.out.println("Suitable tours:");
		for (Tour tour : tourlist.getTourList()) {
			System.out.println(tour);
		}
	}

}
