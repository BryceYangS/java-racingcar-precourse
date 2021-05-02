package com.racingcar.domain;

public class Position {
	private int no;

	public Position() {
		this.no = 0;
	}

	public void moveForward() {
		this.no += 1;
	}

	public int getNo() {
		return no;
	}
}
