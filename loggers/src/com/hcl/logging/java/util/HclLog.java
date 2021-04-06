package com.hcl.logging.java.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HclLog {
public final static Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
public static void sampleLog() {
	LOGGER.log(Level.INFO,"Welcome to hcl");
}
}
