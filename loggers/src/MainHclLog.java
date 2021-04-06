import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.hcl.logging.java.util.HclLog;

public class MainHclLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HclLog.sampleLog();
LogManager slg=LogManager.getLogManager();
Logger log=slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
log.log(Level.INFO,"Hi");
	}

}
