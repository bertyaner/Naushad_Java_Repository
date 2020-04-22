package com.main.java;

public class Money {
	
	private final int amount;
	private final String currency;
	private final Object object;
	private Object java_branch;
	
	public Money(int amountValue, String currency, Object object) {
		this.amount = amountValue;
		this.currency = currency;
		this.object = null;
	}
	
	public Object getObject() {
		return object;
	}

	public int getAmount() {
		return amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public boolean equals(Object anObject) {
		if (anObject instanceof Money) {
			Money money = (Money) anObject;
			return money.getCurrency().equals(getCurrency())
					&& getAmount() == money.getAmount();
		}
		return false;
	}
	
}