package com.racingcar.domain;

public class Car {

	private static final int MOVE_MIN_NUM = 4;

	private final Name name;
	private final Position position;

	public Car(String name) {
		this.name  = new Name(name);
		this.position = new Position();
	}

	public void moveOrStop(int randomNo) {
		if (randomNo < 0 || randomNo > 9) {
			throw new IllegalArgumentException("0 이상 9 이하만 입력이 가능합니다");
		}

		if (randomNo >= MOVE_MIN_NUM) {
			position.moveForward();
		}
	}

	public Name getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

}
