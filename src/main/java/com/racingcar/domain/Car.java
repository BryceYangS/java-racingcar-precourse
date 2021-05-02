package com.racingcar.domain;

public class Car {

	private final int MOVE_BEGIN_NUM = 4;
	private final int MOVE_STOP_MIN_NUM = 0;
	private final int MOVE_STOP_MAX_NUM = 9;

	private final Name name;
	private final Position position;

	public Car(String name) {
		this.name  = new Name(name);
		this.position = new Position();
	}

	public void moveOrStop(int randomNo) {
		if (randomNo < MOVE_STOP_MIN_NUM || randomNo > MOVE_STOP_MAX_NUM) {
			throw new IllegalArgumentException(MOVE_STOP_MIN_NUM + " 이상 " + MOVE_STOP_MAX_NUM +" 이하만 입력이 가능합니다");
		}

		if (randomNo >= MOVE_BEGIN_NUM) {
			position.moveForward();
		}
	}

	public String getName() {
		return name.getName();
	}

	public int getPosition() {
		return position.getNo();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < getPosition(); i++){
			sb.append("-");
		}
		return getName() + " : " + sb.toString();
	}
}
