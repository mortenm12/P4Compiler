package ClassFileCreater;

import java.io.DataOutputStream;
import java.io.IOException;

public class MethodInfoWriter {

	public static void WriteMethodInfo(DataOutputStream TheStream, MethodInfo TheInfo)
	throws IOException {
		TheStream.writeShort(TheInfo.AccessFlags);
		TheStream.writeShort(TheInfo.NameIndex);
		TheStream.writeShort(TheInfo.DescriptorIndex);
		TheStream.writeShort(TheInfo.AttributesCount);
		for(int i = 0; i < TheInfo.AttributesCount; i++){
			AttributeInfoSorter.AttributesInfoWriter(TheStream, TheInfo.TheAttributes[i]);
		}
	}
	
	
}
