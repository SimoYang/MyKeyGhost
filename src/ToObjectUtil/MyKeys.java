package ToObjectUtil;

import java.util.Arrays;

public class MyKeys implements Comparable{
	public Name name=null;
	public int order;
	public int[] point=null;
	public String[] keys=null;
	//是否要释放按下的键
	public boolean flag;
	
	public MyKeys(){
		
	}
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
