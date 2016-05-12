package ClassFileCreater.ClassAttributesClasses;

import java.io.DataOutputStream;
import java.io.IOException;

public class Annotation {
	short TypeIndex;
	short NumElementValuePair;
	short ElementNameIndex[];
	ElementValue TheElementValue[]; 

	public void WriteAnnotation(DataOutputStream TheStream)
	throws IOException{
		TheStream.writeShort(TypeIndex);
		TheStream.writeShort(NumElementValuePair);
		for(int i = 0; i < NumElementValuePair; i++){
			TheStream.writeShort(ElementNameIndex[i]);
			TheElementValue[i].WriteElementValue(TheStream);
		}
	}
}
