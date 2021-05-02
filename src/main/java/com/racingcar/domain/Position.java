package com.racingcar.domain;

public class Position {
	private static final int FIRST_POSITION = 0;
	private static final int FORWARD_ONE_STEP = 1;

	private int no;

	public Position() {
		this.no = FIRST_POSITION;
	}

	public void moveForward() {
		this.no += FORWARD_ONE_STEP;
	}

	public int getNo() {
		return no;
	}
}