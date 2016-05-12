package ClassFileCreater.ClassAttributesClasses;

import java.io.DataOutputStream;
import java.io.IOException;

public class ElementValue {

	byte Tag;
	short ConstValueIndex;
	short TypeNameIndex; 
	short ConstNameIndex;
	
	short ClassInfoIndex;
	Annotation AnnotationValue;
	
	short NumValues;
	ElementValue TheValues[];
	
	public void WriteElementValue(DataOutputStream TheStream)
	throws IOException{

			TheStream.write(Tag);
			TheStream.writeShort(ConstValueIndex);
			TheStream.writeShort(TypeNameIndex);
			TheStream.writeShort(ConstNameIndex);
			TheStream.writeShort(ClassInfoIndex);
			
			if(AnnotationValue != null)
				AnnotationValue.WriteAnnotation(TheStream);
			TheStream.writeShort(NumValues);
			if(NumValues != 0)
				for(int i = 0; i < NumValues; i++)
					TheValues[i].WriteElementValue(TheStream);

	}
}
