package ToObjectUtil;

public class MyKeys implements Comparable{
	public Name name;
	public int order;
	public int[] point;
	public String[] keys;
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
}
