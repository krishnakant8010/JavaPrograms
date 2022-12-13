package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String agrs[]) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "krishna");
		map.put(102, "Mukesh");
		map.put(103, "Rajesh");
		
		System.out.println(map);
		
		for(Map.Entry mapdata:map.entrySet()) {
			System.out.println(mapdata);
			System.out.println();
			 System.out.println(mapdata.getKey()+" "+ mapdata.getValue());  
		}
		
		
		
		
	}
	
}
