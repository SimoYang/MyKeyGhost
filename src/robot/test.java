package robot;

import ToObjectUtil.MyKeys;
import ToObjectUtil.Name;
import ToObjectUtil.ProcessBean;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k={"WINDOW","D"};
		int[] point= {100,200};
		MyKeys key1=new MyKeys(Name.KEYCOMBINE,1,null,k,true);
		MyKeys key2=new MyKeys(null,2,point,null,true);
		ProcessBean p=new ProcessBean();
		p.add(key1);
		p.add(key2);
		String m=GsonUtil.toJs(p);
		System.out.println(m);
		ProcessBean my=GsonUtil.toBean(m);
		System.out.println(my);
		OperateProcess o=new OperateProcess();
		o.operateKeyP(my.allP.get(0).keys, my.allP.get(0).flag);
		o.operateMouse(my.allP.get(1).point, my.allP.get(1).name);
	}

}
