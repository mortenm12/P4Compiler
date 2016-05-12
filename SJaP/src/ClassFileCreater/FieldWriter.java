package ClassFileCreater;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FieldWriter {

	public FieldWriter(DataOutputStream TheStream, FieldContent TheContent){
		try{
			TheStream.writeShort(TheContent.AccessFlags);
			TheStream.writeShort(TheContent.NameIndex);
			TheStream.writeShort(TheContent.DescriptorIndex);
			TheStream.writeShort(TheContent.AttributesCount);
			for(int i = 0; i < TheContent.AttributesCount; i++){
				TheStream.writeShort(TheContent.TheInfo[i].AttributeIndex);
				TheStream.writeInt(TheContent.TheInfo[i].AttributeLength);
				for (int j = 0; j < TheContent.TheInfo[i].AttributeLength; j++){
					AttributeInfoSorter.AttributesInfoWriter(TheStream, TheContent.TheInfo[i]);
				}
			}
		}
		catch(IOException e){
			//handle exception
		}
		
	}
	
}
