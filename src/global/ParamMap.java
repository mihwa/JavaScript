package global;

import javax.servlet.http.HttpServletRequest;

public class ParamMap {
	public static String getValues(HttpServletRequest request,String name) {
			String [] values = request.getParameterMap().get(name);//input의 key값
			StringBuffer buff = new StringBuffer();
			String str ="";
			for (int i = 0; i < values.length; i++) {
				buff.append(values[i]+",");
				
			}
			str = buff.toString().substring(0,buff.toString().length()-1);
			System.out.println("str:"+str);
			return str;
	}
}
