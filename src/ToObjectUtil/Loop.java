package ToObjectUtil;

public class Loop implements Comparable{
	private int begin;
	private int end;
	private int loopTime;
	private int loopOrder;
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getLoopTime() {
		return loopTime;
	}
	public void setLoopTime(int loopTime) {
		this.loopTime = loopTime;
	}
	public int getLoopOrder() {
		return loopOrder;
	}
	public void setLoopOrder(int loopOrder) {
		this.loopOrder = loopOrder;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Loop temp=(Loop) arg0;
		if(this.loopOrder>temp.getLoopOrder()){
			return 1;
		}else if(this.loopOrder<temp.getLoopOrder()){
			return -1;
		}else{
			return 0;
		}
	}
}
