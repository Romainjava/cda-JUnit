package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ConvertisseurTestSuite extends TestSuite {

	public static Test suite() {
		ConvertisseurTestSuite suite = new ConvertisseurTestSuite();
		suite.addTestSuite(ConvertisseurBasiqueTest.class);
		suite.addTestSuite(DeviseTest.class);
		suite.addTestSuite(ConvertisseurTest.class);
		return suite;
	}
}
