package com.subhash.entity;

public enum OrderStatus {
	ORDERD("orderd"), PROCESSED("processed"), DELIVERED("delivered"), REFUNDED("refunded"), CANCELED("canceled"),;

	private String value;

	private OrderStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
