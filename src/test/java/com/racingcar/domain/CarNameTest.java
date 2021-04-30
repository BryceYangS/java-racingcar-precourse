package com.racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {

	@Test
	@DisplayName("자동차 이름 유효성 검사")
	void carNameValidation() {
		Name carName = new Name();
		assertThatIllegalArgumentException().isThrownBy(() -> {
			carName.setName("aaaaaa");
		});

		assertThatIllegalArgumentException().isThrownBy(() -> {
			carName.setName("");
		});
	}
}
