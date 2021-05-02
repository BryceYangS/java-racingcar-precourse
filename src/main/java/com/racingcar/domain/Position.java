package com.racingcar.domain;

public class Position {
	private final int FIRST_POSITION = 0;

	private int no;

	public Position() {
		this.no = FIRST_POSITION;
	}

	public void moveForward() {
		this.no += 1;
	}

	public int getNo() {
		return no;
	}
}
