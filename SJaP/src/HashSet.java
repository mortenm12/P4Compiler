import java.util.Map;


public class HashSet {
	private Map<String,Type> table;
	
	
	
	public void add(Type var){
		table.put(var.typeId, var);
	}
	
	public Type get(String id){
		return table.get(id);
	}
	
	public boolean check(String id) {
		return table.containsKey(id);
	}
	
}
