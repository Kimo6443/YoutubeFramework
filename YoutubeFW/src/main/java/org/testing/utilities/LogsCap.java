package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCap {
	public static void takelogs(String classname,String message)
	{
		DOMConfigurator.configure("../htdf/LogsLayout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
		}
}
