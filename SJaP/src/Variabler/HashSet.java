package Variabler;
import java.util.Map;

import Exceptions.existingVariableException;



public class HashSet {
	private Map<String,Var> table;
	
	
	
	public void add(Var var ) throws existingVariableException{
		if(!check(var.typeId))
			table.put(var.typeId, var);
		else
			throw new existingVariableException("Du kan ikke oprette to variabler med samme navn.");
	}
	
	public Var get(String id){
		return table.get(id);
	}
	
	public boolean check(String id) {
		return table.containsKey(id);
	}
	
	public void changeVar(Var x) throws existingVariableException{
		table.remove(x.typeId);
		add(x);
	}
	
	
	
}
