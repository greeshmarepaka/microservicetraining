package com.db;


import java.math.BigDecimal;
public class ConversionValue {
	
	private int id;
	private String valueFrom;
	private String valueTo;
	private BigDecimal conversionMultiple;
	int port;
	
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValueFrom() {
		return valueFrom;
	}
	public void setValueFrom(String valueFrom) {
		this.valueFrom = valueFrom;
	}
	public String getValueTo() {
		return valueTo;
	}
	public void setValueTo(String valueTo) {
		this.valueTo = valueTo;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ConversionValue(int id, String valueFrom, String valueTo, BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.valueFrom = valueFrom;
		this.valueTo = valueTo;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}

	public ConversionValue() {}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
}