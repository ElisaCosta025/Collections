import java.util.Map;
import java.util.HashMap;

class Count{

	private Map<String, Integer> M = new HashMap<String, Integer>();
	
	public Count(String s){
		String[] S_Array = s.split(" ");
		
		for (String str : S_Array){
			Integer i = M.get(str);
			if (i == null){
				M.put(str, 1);
			}
			else{
				M.replace(str, i+1);
			}
		}
		System.out.println(M);
	}
}
