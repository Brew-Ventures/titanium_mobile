/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package org.appcelerator.kroll;

import java.util.HashMap;

/**
 * An interface that exposes a Javascript function to Java.
 */
public interface KrollFunction
{
	public class FunctionArgs
	{
		public KrollObject krollObject;
		public Object[] args;

		public FunctionArgs(KrollObject krollObject, Object[] args)
		{
			this.krollObject = krollObject;
			this.args = args;
		}
	}

	/**
	 * Executes a function synchronously. The result of call is the result of the Javascript function.
	 * @param krollObject the object when the function is executed
	 * @param args A single object argument for the function (for convenience)
	 * @return the result of the executed function.
	 */
	public Object call(KrollObject krollObject, HashMap args);
	
	/**
	 * Executes a function synchronously. The result of call is the result of the Javascript function.
	 * @param krollObject the object when the function is executed.
	 * @param args the function's arguments.
	 * @return the result of the executed function.
	 */
	public Object call(KrollObject krollObject, Object[] args);
	
	/**
	 * Executes a function asynchronously. 
	 * @param krollObject the object when the function is executed.
	 * @param args A single object argument for the function (for convenience)
	 */
	public void callAsync(KrollObject krollObject, HashMap args);
	
	/**
	 * Executes a function asynchronously. 
	 * @param krollObject the object when the function is executed.
	 * @param args the function's arguments.
	 */
	public void callAsync(KrollObject krollObject, Object[] args);
}

