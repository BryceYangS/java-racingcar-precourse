package com.racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarGameTest {

	private static RacingCarGame racingCarGame;

	@BeforeAll
	static void init() {
		racingCarGame = new RacingCarGame();
	}

	@Test
	@DisplayName("횟수 1 이상 입력 필수")
	void inputCount() {
		assertThatThrownBy(() -> racingCarGame.inputCount(0));
	}

	@Test
	@DisplayName("자동차 이름 대 이상 입력 필수")
	void inputCarNames() {
		assertThatThrownBy(() -> racingCarGame.inputCarNames("asdf"));
	}
}