package com.racingcar.domain;

import java.util.List;

public class RacingCarGame {
	private final int CAR_MIN_NUMBER = 2;
	private final int COUNT_MIN_NUMBER = 1;

	private RacingCars cars;

	public void inputCarNames(String inCarNames) {
		String[] carNames = inCarNames.split(",");
		if (carNames.length < CAR_MIN_NUMBER) throw new IllegalArgumentException("자동차는 2대 이상 입력해주세요");
		cars = new RacingCars(carNames);
	}

	public int inputCount(int inCount) {
		if (inCount < COUNT_MIN_NUMBER) throw new IllegalArgumentException("횟수는 1회 이상 입력하세요.");
		return inCount;
	}

	public void run(int count) {
		System.out.println("실행결과");
		for (int i=0; i < count; i++) {
			cars.race();
			System.out.println();
		}
		printWinner();
	}

	private void printWinner() {
		List<Car> winners = cars.getWinners();
		StringBuilder sb = new StringBuilder();
		int winnersNum = winners.size();

		for(int i=0; i < winnersNum; i++) {
			sb.append(winners.get(i).getName());
			sb = (i == winnersNum - 1) ? sb : sb.append(", ");
		}
		System.out.println(sb.append("가 최종 우승했습니다."));
	}
}
