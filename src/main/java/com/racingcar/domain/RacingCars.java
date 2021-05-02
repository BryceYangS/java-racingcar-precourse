package com.racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingCars {
	private final int RANDOM_MAX_NUMBER = 10;
	private final List<Car> cars;

	public RacingCars(String[] carNames) {
		cars = new ArrayList<>();
		for (String carName : carNames) {
			registerRacingCar(carName);
		}
	}


	private void registerRacingCar(String carName) {
		cars.add(new Car(carName));
	}

	public void race() {
		Random ra = new Random();
		for (Car car : cars) {
			car.moveOrStop(extractRandomNo(ra));
			System.out.println(car);
		}
	}

	private int extractRandomNo(Random ra) {
		return ra.nextInt(RANDOM_MAX_NUMBER);
	}

	public List<Car> getWinners() {
		cars.sort(RacingCars::compare);
		int maxPosition = cars.get(0).getPosition();
		List<Car> winners = new ArrayList<>();

		for (int i = 0; i < cars.size() && cars.get(i).getPosition() == maxPosition; i ++) {
			winners.add(cars.get(i));
		}
		return winners;
	}

	private static int compare(Car s1, Car s2) {
		return s2.getPosition() - s1.getPosition();
	}
}
