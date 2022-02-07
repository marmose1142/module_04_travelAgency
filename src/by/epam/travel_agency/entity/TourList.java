package by.epam.travel_agency.entity;

import java.util.ArrayList;
import java.util.List;

public class TourList {
	private List<Tour> tourList;

	public TourList() {

	}

	public TourList(List<Tour> tourList) {
		this.tourList = new ArrayList<>();
	}

	public void addTour(Tour tour) {
		if (tourList == null) {
			tourList = new ArrayList<>();
		}
		tourList.add(tour);
	}

	public void remove(Tour tour) {
		tourList.remove(tour);
	}

	public List<Tour> getTourList() {
		return tourList;
	}

	public void setTourList(List<Tour> tourList) {
		this.tourList = tourList;
	}

	@Override
	public String toString() {
		return "TourList [tourList=" + tourList + "]";
	}
	

}
