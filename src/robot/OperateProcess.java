package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import ToObjectUtil.ProcessBean;

public class OperateProcess {
		Robot r;
		static Map<String,Integer> key;
		static{
		    key=new HashMap<>();
			key.put("SHIFT", KeyEvent.VK_SHIFT);
			key.put("CTRL", KeyEvent.VK_CONTROL);
			key.put("TAB",KeyEvent.VK_TAB);
			key.put("ENTER",KeyEvent.VK_ENTER);
			key.put("A",KeyEvent.VK_A);
		}
		public OperateProcess(){
			try {
				r=new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void OperateKeyP(String s){
			int s1=key.get(s);
			r.keyPress(s1);
		}
		
}
