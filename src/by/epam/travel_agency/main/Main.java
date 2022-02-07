package by.epam.travel_agency.main;

import by.epam.travel_agency.entity.BeachRest;
import by.epam.travel_agency.entity.CruiseTour;
import by.epam.travel_agency.entity.ExcursionTour;
import by.epam.travel_agency.entity.SanatoriumTour;
import by.epam.travel_agency.entity.Tour;
import by.epam.travel_agency.entity.TourList;
import by.epam.travel_agency.logic.Logic;
import by.epam.travel_agency.view.View;

/*Туристические путевки.Сформировать набор предложений клиенту по выбору туристической путевки различного типа
* (отдых, экскурсии, лечение, шопинг, круиз, и т.д.) для оптимального выбора. Учитывать возможность выбора транспорта,
* питания и числа дней.Реализовать выбор и сортировку путевок.*/

public class Main {

	public static void main(String[] args) {
		TourList tourList = new TourList();
		View view = new View();
		Logic logic = new Logic();

		tourList.addTour(new BeachRest("beach rest", "plane", 14, 1000, "buffet", "Spain"));
		tourList.addTour(new BeachRest("beach rest", "plane", 14, 800, "buffet", "Greece"));
		tourList.addTour(new BeachRest("beach rest", "plane", 21, 1800, "all inclusive", "Greece"));
		tourList.addTour(new BeachRest("beach rest", "plane", 21, 2000, "all inclusive", "Spain"));
		tourList.addTour(new SanatoriumTour("sanatorium tour", "train", 14, 700, "all inclusive"));
		tourList.addTour(new SanatoriumTour("sanatorium tour", "train", 21, 1000, "all inclusive"));
		tourList.addTour(new ExcursionTour("excursion tour", "bus", 8, 500, "Poland, Germany, France"));
		tourList.addTour(new ExcursionTour("excursion tour", "bus", 10, 700, "Poland, Germany, France, Czech"));
		tourList.addTour(new ExcursionTour("excursion tour", "bus", 6, 350, "Poland, Germany"));
		tourList.addTour(
				new CruiseTour("cruise", "ship", 14, 5000, "all inclusive", "Russia, Estonia, Lithuania, Latvia"));
		tourList.addTour(new CruiseTour("cruise", "ship", 30, 10000, "Spain, USA, Brasil, Argentina", "all inclusive"));
		tourList.addTour(new CruiseTour("cruise", "ship", 25, 8000, "Spain, USA, Brasil, Argentina", "all inclusive"));
		tourList.addTour(new Tour("shop tour", "bus", 1, 50));
		tourList.addTour(new Tour("shop tour", "bus", 2, 70));

		String firstparametr = logic
				.enterFromConsol("Please, choose one of the parameters-transport or food or number of days");
		String choiceParametr = logic.choiceParametr(firstparametr);
		String nextParametr = logic
				.enterFromConsol(choiceParametr);

		TourList tourlist = logic.choiceMethod(tourList, firstparametr, nextParametr, logic);

		view.printTourList(tourlist);

	}

}
