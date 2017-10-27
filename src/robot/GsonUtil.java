package robot;

import com.google.gson.Gson;

import ToObjectUtil.ProcessBean;

public class GsonUtil {
	public static String toJs(ProcessBean p){
		Gson gson=new Gson();
		String js=gson.toJson(p);
		return js;
	}
	public static ProcessBean toBean(String s){
		Gson gson=new Gson();
		ProcessBean p=null;
		p=gson.fromJson(s, ProcessBean.class);
		return p;
	}
}
