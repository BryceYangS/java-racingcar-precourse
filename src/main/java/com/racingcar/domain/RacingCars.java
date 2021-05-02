package com.racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
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
}