package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import ToObjectUtil.Name;
import ToObjectUtil.ProcessBean;
import ToObjectUtil.MyKeys;

public class OperateProcess {
		Robot r;
		static Map<String,Integer> key;
		//创建一个包含所有KeyCode的Map
		static{
		    key=new HashMap<>();
			key.put("SHIFT", KeyEvent.VK_SHIFT);
			key.put("CTRL", KeyEvent.VK_CONTROL);
			key.put("TAB",KeyEvent.VK_TAB);
			key.put("ENTER",KeyEvent.VK_ENTER);
			key.put("A",KeyEvent.VK_A);
			key.put("B", KeyEvent.VK_B);
			key.put("C", KeyEvent.VK_C);
			key.put("D", KeyEvent.VK_D);
			key.put("E", KeyEvent.VK_E);
			key.put("G", KeyEvent.VK_G);
			key.put("H", KeyEvent.VK_H);
			key.put("I", KeyEvent.VK_I);
			key.put("J", KeyEvent.VK_J);
			key.put("K", KeyEvent.VK_K);
			key.put("L", KeyEvent.VK_L);
			key.put("M", KeyEvent.VK_M);
			key.put("N", KeyEvent.VK_N);
			key.put("O", KeyEvent.VK_O);
			key.put("P", KeyEvent.VK_P);
			key.put("Q", KeyEvent.VK_Q);
			key.put("R", KeyEvent.VK_R);
			key.put("S", KeyEvent.VK_S);
			key.put("T", KeyEvent.VK_T);
			key.put("U", KeyEvent.VK_U);
			key.put("V", KeyEvent.VK_V);
			key.put("W", KeyEvent.VK_W);
			key.put("X", KeyEvent.VK_X);
			key.put("Y", KeyEvent.VK_Y);
			key.put("Z", KeyEvent.VK_Z);
			key.put("ALT", KeyEvent.ALT_MASK);
			key.put("WINDOW", KeyEvent.VK_WINDOWS);
			key.put("BACKS", KeyEvent.VK_BACK_SPACE);
			key.put("1", KeyEvent.VK_1);
			key.put("2", KeyEvent.VK_2);
			key.put("3", KeyEvent.VK_3);
			key.put("4", KeyEvent.VK_4);
			key.put("5", KeyEvent.VK_5);
			key.put("6", KeyEvent.VK_6);
			key.put("7", KeyEvent.VK_7);
			key.put("8", KeyEvent.VK_8);
			key.put("9", KeyEvent.VK_9);
		}
		//对ProcessBean进行解析的方法
		public void analyze(ProcessBean temp){
			
		}
		//调度鼠标和键盘循环的函数
		public void charge(ArrayList<MyKeys> p,int i,int e){
			for(i--;(i+1)<e;i++){
				MyKeys k=p.get(i);
				if(k.name==Name.KEYCOMBINE){
					operateKeyP(k.keys,k.flag);
				}else{
					operateMouse(k.point,k.name);
				}
			}
		}
		//初始化OperateProcess
		public OperateProcess(){
			try {
				r=new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//处理键盘输入的接口,flag代表是否要放开所按下的键
		public void operateKeyP(String[] s,boolean flag){
				for (String temp:s ) {
					int tempInt=key.get(temp);
					r.keyPress(tempInt);
				}
				if (flag) {
					for (String temp :s ) {
						int tempInt=key.get(temp);
						r.keyRelease(tempInt);
					}
				}
		}
		//处理鼠标输入的接口
		public void operateMouse(int[] r,Name name){
			if(r!=null){
				this.r.mouseMove(r[0], r[1]);
			}
			if(name==Name.MOUSEBUTTON1){
				this.r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				this.r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			}else if(name==Name.MOUSEBUTTON2){
				this.r.mousePress(InputEvent.BUTTON2_DOWN_MASK);
				this.r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
			}else if(name==Name.MOUSESCROLL){
				this.r.mouseWheel(InputEvent.BUTTON3_DOWN_MASK);
			}
			
		}

		//

}
