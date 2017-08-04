package com.design.prototype;

import java.io.Serializable;

public class Type implements Serializable{
private static final long serialVersionUID = 1L;
private String type;

public Type() {
	super();
}

public Type(String type) {
	super();
	this.type = type;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
   
}
