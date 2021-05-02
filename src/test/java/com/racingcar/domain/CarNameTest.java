package com.racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {

	@Test
	@DisplayName("자동차 이름 유효성 검사")
	void carNameValidation() {
		assertThatIllegalArgumentException().isThrownBy(() -> {
			new Name("aaaaaa");
		});

		assertThatIllegalArgumentException().isThrownBy(() -> {
			new Name("");
		});
	}



	@Test
	void 랜덤테스트(){
		Random random = new Random();
		System.out.println(random.nextInt(9));
	}
}
