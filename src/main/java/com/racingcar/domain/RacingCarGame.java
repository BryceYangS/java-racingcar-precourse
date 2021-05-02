package com.racingcar.domain;

public class RacingCarGame {
	private RacingCars cars;

	public void inputCarNames(String inCarNames) {
		String[] carNames = inCarNames.split(",");
		if (carNames.length < 2) throw new IllegalArgumentException("자동차는 2대 이상 입력해주세요");
		cars = new RacingCars(carNames);
	}

	public int inputCount(int inCount) {
		if (inCount < 1) throw new IllegalArgumentException("횟수는 1회 이상 입력하세요.");
		return inCount;
	}

	public void run(int count) {

	}
}
