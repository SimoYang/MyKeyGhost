package ToObjectUtil;

import java.util.ArrayList;

public class ProcessBean {
	public ProcessBean(ArrayList<Loop> m){
		allP=new ArrayList<>();
		this.begin=m;
	}
	public ProcessBean(){
		allP=new ArrayList<>();
		this.begin=null;
	}
	private ArrayList<Loop> begin;
	//储存所有步骤的List
	public ArrayList<MyKeys> allP;
	//判断步骤顺序是否重复并向List中添加步骤
	public void add(MyKeys m){
		int s=m.order;
		if(s==0){
			System.out.println("步骤未进行初始化，出现错误");
			return;
		}else if(allP.isEmpty()){
			allP.add(m);
		}else if(s<allP.size()&&allP.get(s-1).order==s){
			System.out.println("出现了相同顺序的步骤，无法执行");
			return;
		}else{
			allP.add(m);
		}
	}
	//重写toString 方法
	@Override
	public String toString(){
		return allP.toString();
	}
	//得到begin属性的方法
	public ArrayList<Loop> getFlag() {
		return begin;
	}
	/*定义begin属性的方法,因为使用的是多维数组，所以在使用时只能初始化一次，
	 * 在进行初始化时如果用户的循环步骤不是一次性输入的，则必须创建一个缓存数组，在确认后再进行最终的初始化
	 * 在完成配置后，如果想更改某一步，则需要先引出数组，完成更改后，在对对象中的数组进行更改
	 */
	public void setBegin(ArrayList<Loop> m){
		this.begin=m;
	}
}
