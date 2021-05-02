package com.racingcar.domain;

public class Name {
	private final int NAME_MIN_LENGTH = 1;
	private final int NAME_MAX_LENGTH = 5;

	private String name;

	public Name(String name) {
		if (name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH) throw new IllegalArgumentException("자동차 이름은 한 글자 이상 다섯 글자 이하만 가능합니다.");
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
