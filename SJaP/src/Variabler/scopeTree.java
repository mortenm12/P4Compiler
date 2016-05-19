package Variabler;

import java.util.LinkedList;
import java.util.List;

import Exceptions.existingVariableException;
import Exceptions.noIdException;


public class scopeTree {
	public String ScopeName;
	private List<scopeTree> Nodes;
	public HashSet HashTable;
	public scopeTree parent;
	public List<String> TypeList;
	
	public scopeTree(){
		Nodes = new LinkedList<scopeTree>();
		TypeList = new LinkedList<String>();
		HashTable = new HashSet();
	}
	
	public scopeTree addScope(String name){
		scopeTree x = new scopeTree();
		x.ScopeName = name;
		x.parent=this;
		
		Nodes.add(x);
		return x;
	}
	
	public void addVar(String id, String type, short intId) throws existingVariableException{
		Var x = new Var();
		x.type=type;
		x.typeId=id;
		x.intId=intId;
		HashTable.add(x);
	}
	
	public scopeTree searchScope(String name){
		if(name == this.ScopeName){
			return this;
		}
		else if(parent != null)
		{
			return parent.searchScope(name);
				
		}
		else
		{
			return null;
		}
	}
	
	public Var searchVar(String name) throws noIdException
	{
		if(HashTable.check(name))
			return HashTable.get(name);
		else if(parent != null)
			return parent.searchVar(name);
		else 
			throw new noIdException("Der findes ikke en variabel eller metode med id: " + name);
			
	}
}
