package ClassFileCreater;

import java.io.*;
import java.io.DataOutput.*;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;


public class CreateRunnableClass {
	
	
	public CreateRunnableClass(String FilePath, int ConstantPoolCount, List<ConstantPoolContent> PoolTags,
			int FieldsCount, int MethodCount, int AttributesCount, FieldContent TheFieldContent[],
					MethodInfo TheMethods[], AttributesInfo TheAttributes[]){
		DataOutputStream TheStream;
		
		try{
			TheStream = new DataOutputStream(new FileOutputStream(FilePath + ".class"));
		}
		catch(FileNotFoundException e){
			return ;
		}
		//this is the format found in 4.1 on which is the starting point
		//https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html
		try{
			TheStream.writeInt(0xCAFE);
			TheStream.writeInt(0xBABE);
			TheStream.writeInt(0x0001); //minor version number
			TheStream.writeInt(0x0001); //major version number
			TheStream.writeInt(ConstantPoolCount);
			new WriteConstantPool(TheStream, PoolTags);
			TheStream.writeInt(0x0020); //access flag, super
			TheStream.writeInt(0x0000); //location of this class in constant pool, i assume its the first
			TheStream.writeInt(0x0000); //superclass, which is none
			TheStream.writeInt(0x0000); //amount interfaces
			TheStream.writeInt(0x0000); //array containing all 0 interfaces
			TheStream.writeInt(FieldsCount);
			for(int i = 0; i < FieldsCount; i++)
				new FieldWriter(TheStream, TheFieldContent[i]);
			TheStream.writeInt(MethodCount);
			for(int i = 0; i < MethodCount; i++)
				MethodInfoWriter.WriteMethodInfo(TheStream, TheMethods[i]);
			TheStream.writeInt(AttributesCount);
			for(int i = 0; i < AttributesCount; i++)
				AttributeInfoSorter.AttributesInfoWriter(TheStream, TheAttributes[i]);			
			
		}
		catch(IOException e){
			
		}
		
	}
	

}
