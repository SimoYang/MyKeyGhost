package ToObjectUtil;

import java.util.Arrays;

public class MyKeys implements Comparable{
	public Name name=null;
	public int order=0;
	public int[] point=null;
	public String[] keys=null;
	//是否要释放按下的键
	public boolean flag=true;
	//无参构造器，对象中的元素均为null
	public MyKeys(){
		
	}
	/*
	 * 带参数的初始化方法，初始化参数包括操作名称，操作次序，
	 * 是否要移动鼠标点（若参数为null则说明不移动）、要按下的按键（无则为null）
	 * 以及是否要放开所按下的按键
	 */
	public MyKeys(Name n,int o,Object p,String[] k,boolean f){
		this.name=n;
		this.order=o;
		if(p==null){
		}else if(p.getClass().isArray()){
			this.point=(int[]) p;
		}
		this.keys=k;
		this.flag=f;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		MyKeys temp=(MyKeys) arg0;
		if(temp.order>this.order){
			return -1;
		}else if(temp.order<this.order){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		return "MyKeys [name=" + name + ", order=" + order + ", point=" + Arrays.toString(point) + ", keys="
				+ Arrays.toString(keys) + ", flag=" + flag + "]";
	}
	
}
