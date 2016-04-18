package Variabler;
import java.util.Map;



public class HashSet {
	private Map<String,Var> table;
	
	
	
	public void add(Var var){
		table.put(var.typeId, var);
	}
	
	public Var get(String id){
		return table.get(id);
	}
	
	public boolean check(String id) {
		return table.containsKey(id);
	}
	
}
