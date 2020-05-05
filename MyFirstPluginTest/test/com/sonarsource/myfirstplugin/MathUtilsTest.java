package com.sonarsource.myfirstplugin;

import static com.sonarsource.myfirstplugin.MathUtils.halfOf;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsTest {
	@Test
	public void two_is_half_of_four() {
		assertEquals(2, halfOf(4));
	}
}
