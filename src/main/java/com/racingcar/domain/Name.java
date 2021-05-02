package com.racingcar.domain;

public class Name {
	private String name;

	public Name(String name) {
		if (name.length() == 0 || name.length() > 5) throw new IllegalArgumentException("자동차 이름은 한 글자 이상 다섯 글자 이하만 가능합니다.");
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
