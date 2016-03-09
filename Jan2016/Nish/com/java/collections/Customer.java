package com.java.collections;


import java.util.*;

public class Customer {
	  private Map<Object, Object> maps = new HashMap<Object, Object>();

	  public Map<Object, Object> getMaps() {
	    return maps;
	  }

	  public void setMaps(Map<Object, Object> maps) {
	    this.maps = maps;
	  }
	  public String toString() {
		    return maps.toString();
		  }

	  
	}

