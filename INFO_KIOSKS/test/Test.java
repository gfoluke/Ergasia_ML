import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
//import org.junit.Test;


public class Test {
	@BeforeClass
	public static void testSetup(){
	System.out.println("Starting...");
	}
	@AfterClass
	public static void testCleanup(){
	System.out.println("Done!");
	}
	//@Test
	//public void testarx14() {
	//	Application appl=new Application();
	//	BasicButtons tester1 = new BasicButtons();
	//	assertEquals("Result", 0, tester1.arx14( appl.panelcontact, appl.panelinfo , appl.l));
	//}

}
