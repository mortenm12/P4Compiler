package ClassFileCreater;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteConstantPool {

	public  WriteConstantPool(DataOutputStream TheStream, List<ConstantPoolContent> PoolTags){	
		//TODO: figure out how constant names are saved, and write them here
		//4.2 helps with their names
		
		for(ConstantPoolContent TheContent : PoolTags){
			try{
			switch(TheContent.tag){
				case "Class": TheStream.write(7); 
					TheStream.writeShort(TheContent.info.Index);
						
					break;
				case "FieldRef": TheStream.write(9); 
					TheStream.writeShort(TheContent.info.Index);
					TheStream.writeShort(TheContent.info.NameTypeIndexOrDescriptorIndex);
					break;
				case "MethodRef": TheStream.write(10); 
					TheStream.writeShort(TheContent.info.Index);
					TheStream.writeShort(TheContent.info.NameTypeIndexOrDescriptorIndex);
				
					break;
				case "String": TheStream.write(8); 
					TheStream.writeShort(TheContent.info.Index);
					break;
				case "Double": TheStream.write(6); 
					TheStream.writeInt(TheContent.info.HighBytes);
					TheStream.writeInt(TheContent.info.LowBytes);
					break;
				case "NameAndType": TheStream.write(12); 
					TheStream.writeShort(TheContent.info.Index);
					TheStream.writeShort(TheContent.info.NameTypeIndexOrDescriptorIndex);
					break;
				case "UTF8": TheStream.write(1); 
					TheStream.writeInt(TheContent.info.Index);
					for(int i = 0; i < TheContent.info.Index; i++)
						TheStream.write(TheContent.info.TheBytes[i]);
					break;
				case "MethodHandle": TheStream.write(15); 
					TheStream.write(TheContent.info.ReferenceKind);
					TheStream.writeShort(TheContent.info.Index);
					break;
				case "InvokeDynamic": TheStream.write(18); 
					TheStream.writeShort(TheContent.info.Index);
					TheStream.writeShort(TheContent.info.NameTypeIndexOrDescriptorIndex);
					break;
				default: break;
			}
			}
			catch(IOException e){
			//TODO: errorhandling
			}

		}
	}
}