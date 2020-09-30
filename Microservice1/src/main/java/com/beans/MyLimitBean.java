package com.beans;

public class MyLimitBean {
	
	int maximum,minimum;

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "MyLimitBean [maximum=" + maximum + ", minimum=" + minimum + "]";
	}

	public MyLimitBean(int minimum, int maximum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
    public MyLimitBean(){}
}
