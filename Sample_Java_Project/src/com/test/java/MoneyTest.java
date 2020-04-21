package com.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.java.Money;

class MoneyTest {

	@Test
	void testMoney() {
		//fail("Not yet implemented");
		Money money = new Money(10, "USD", "abc");
		assertEquals(10, money.getAmount(),"working fine for integer");
		assertEquals("USD", money.getCurrency(),"working fine for string");
		assertNull(money.getObject(),"it is null");
		assertTrue(money.getCurrency().equalsIgnoreCase("USD"),"it is true");
		//assertFalse(money.getCurrency().equalsIgnoreCase("RS"),"it is false");
	}

}
