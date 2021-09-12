package com.tct.bestMovieApp.util;

import java.util.Map;

public class SearchFilter {
	
	private Map<String, Object> params;
	
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public Map<String, Object> getParams(){
		return this.params;
	}
}
