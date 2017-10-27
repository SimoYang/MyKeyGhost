package ToObjectUtil;

import java.util.ArrayList;

public class ProcessBean {
	public ProcessBean(int m,int n){
		allP=new ArrayList<>();
		this.begin=m;
	}
	public ProcessBean(){
		allP=new ArrayList<>();
		this.begin=0;
	}
	//确定是否要循环以及从第几步开始循环的参数
	private int begin;
	private int end;
	//储存所有步骤的List
	public ArrayList<MyKeys> allP;
	//判断步骤顺序是否重复并向List中添加步骤
	public void add(MyKeys m){
		int s=m.order;
		if(allP.isEmpty()){
			allP.add(m);
			System.out.println("添加了第一个元素");
		}else if(s<allP.size()&&allP.get(s-1).order==s){
			System.out.println("出现了相同顺序的步骤，无法执行");
		}else{
			allP.add(m);
		}
	}
	@Override
	public String toString(){
		return allP.toString();
	}
	public int getFlag() {
		return begin;
	}
}
