package com.xier.exception;
/**
 *定义异常类
 * @author wuyongyi
 * 2019-12-04
 */
public class SoldOutException extends Exception{
	private static final long serialVersionUID = -9134601516831765948L;

	  public SoldOutException(String message) { 
	    super(message);//把参数传递给Throwable的带String参数的构造方法 
	  } 
}
