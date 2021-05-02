package com.racingcar.domain;

public class Name {
	private static final int NAME_MIN_LENGTH = 1;
	private static final int NAME_MAX_LENGTH = 5;

	private String name;

	public Name(String name) {
		validateName(name);
		this.name = name;
	}

	private void validateName(String name) {
		if (name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH)
			throw new IllegalArgumentException(
				"자동차 이름은 " + NAME_MIN_LENGTH + " 글자 이상 " + NAME_MAX_LENGTH + " 글자 이하만 가능합니다.");
	}

	public String getName() {
		return name;
	}
}
