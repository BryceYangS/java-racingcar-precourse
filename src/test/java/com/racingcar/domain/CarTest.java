package com.racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	@DisplayName("전진 테스트")
	void move() {
		/* given */
		Car car = new Car("bryce");

		/* when */
		int positionNumBeforeMove = car.getPosition();
		car.moveOrStop(4);
		int positionNumAfterMove = car.getPosition();

		/* then */
		assertThat(positionNumBeforeMove + 1).isEqualTo(positionNumAfterMove);
	}

	@Test
	@DisplayName("정지 테스트")
	void stop() {
		/* given */
		Car car = new Car("bryce");

		/* when */
		int positionNumBeforeMove = car.getPosition();
		car.moveOrStop(3);
		int positionNumAfterMove = car.getPosition();

		/* then */
		assertThat(positionNumBeforeMove).isEqualTo(positionNumAfterMove);
	}

	@Test
	@DisplayName("전진/정지 입력값 에러 테스트")
	void testMoveOrStopOfOutliersInput() {
		/* given */
		Car bryceCar = new Car("bryce");

		/* when & then */
		assertThatIllegalArgumentException().isThrownBy(() -> bryceCar.moveOrStop(-1));
		assertThatIllegalArgumentException().isThrownBy(() -> bryceCar.moveOrStop(10));
	}
}
