package by.epam.travel_agency.logic;

import java.util.Scanner;

import by.epam.travel_agency.entity.BeachRest;
import by.epam.travel_agency.entity.CruiseTour;
import by.epam.travel_agency.entity.SanatoriumTour;
import by.epam.travel_agency.entity.TourList;

public class Logic {

	public TourList searchByTransport(TourList tourList, String transport) {
		TourList tourListByTransport = new TourList();
		for (int i = 0; i < tourList.getTourList().size(); i++) {
			if (transport.equals(tourList.getTourList().get(i).getTransport())) {
				tourListByTransport.addTour(tourList.getTourList().get(i));
			}
		}

		return tourListByTransport;

	}

	public TourList searchByFood(TourList tourlist, String food) {
		TourList tourListByFood = new TourList();
		String meal = "";
		for (int i = 0; i < tourlist.getTourList().size(); i++) {
			if (tourlist.getTourList().get(i) instanceof BeachRest) {

				meal = ((BeachRest) tourlist.getTourList().get(i)).getFood();
				if (food.equals(meal)) {
					tourListByFood.addTour(tourlist.getTourList().get(i));
				}
			}

			if (tourlist.getTourList().get(i) instanceof SanatoriumTour) {
				meal = ((SanatoriumTour) tourlist.getTourList().get(i)).getFood();

				if (food.equals(meal)) {
					tourListByFood.addTour(tourlist.getTourList().get(i));
				}
			}
			if (tourlist.getTourList().get(i) instanceof CruiseTour) {
				meal = ((CruiseTour) tourlist.getTourList().get(i)).getFood();
				if (food.equals(meal)) {
					tourListByFood.addTour(tourlist.getTourList().get(i));
				}
			}
		}

		return tourListByFood;

	}

	public TourList searchByNumberDays(TourList tourList, String number) {
		TourList tourListByNumberDays = new TourList();
		int numberOfDays = Integer.parseInt(number);

		for (int i = 0; i < tourList.getTourList().size(); i++) {
			if (numberOfDays == tourList.getTourList().get(i).getNumberOfDays()) {
				tourListByNumberDays.addTour(tourList.getTourList().get(i));
			}

		}
		return tourListByNumberDays;
	}

	public TourList choiceMethod(TourList tourlists, String parametr, String secondParametr, Logic logic) {
		TourList tourlist = new TourList();

		if ("transport".equalsIgnoreCase(parametr)) {
			tourlist = logic.searchByTransport(tourlists, secondParametr);
		}
		if ("food".equalsIgnoreCase(parametr)) {
			tourlist = logic.searchByFood(tourlists, secondParametr);
		}
		if ("number of days".equalsIgnoreCase(parametr)) {
			tourlist = logic.searchByNumberDays(tourlists, secondParametr);
		}
		return tourlist;
	}

	public String choiceParametr(String parametr) {
		String nextParametr = "";
		if ("transport".equalsIgnoreCase(parametr)) {
			nextParametr = "Please, choose one of the parameters- plane, bus, ship or train";
		}
		if ("food".equalsIgnoreCase(parametr)) {
			nextParametr = "Please, choose one of the parameters- buffet, all inclusive";
		}
		if ("number of days".equalsIgnoreCase(parametr)) {
			nextParametr = "Please, choose one of the parameters- 1,2,6,8,10,14,21,25,30";
		}
		return nextParametr;
	}

	public String enterFromConsol(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		if (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();

	}

}
