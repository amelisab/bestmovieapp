package com.tct.bestMovieApp.converters;

public interface Converter<R , E> {
	
	public R convert(E e);
	public E reverseConvert(R r);
	

}
