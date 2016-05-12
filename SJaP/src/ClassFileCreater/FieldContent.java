package ClassFileCreater;

import java.io.DataOutputStream;
import java.io.IOException;

import ClassFileCreater.ClassAttributesClasses.ExceptionContent;

public class FieldContent {

	short AccessFlags;
	short NameIndex;
	short DescriptorIndex;
	short AttributesCount;
	AttributesInfo TheInfo[];
	
	public void WriteAttributesInfo(DataOutputStream TheStream){
		for(int i = 0; i < AttributesCount; i++){
			try{
				AttributeInfoSorter.AttributesInfoWriter(TheStream, TheInfo[i]);
			}
			catch(IOException e){
				//TODO: error handling
			}
		}
	}
	
}
