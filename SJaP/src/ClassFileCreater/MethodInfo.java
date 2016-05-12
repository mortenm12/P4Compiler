package ClassFileCreater;

import java.io.DataOutputStream;
import java.io.IOException;


public class MethodInfo {

	short AccessFlags;
	short NameIndex;
	short DescriptorIndex;
	short AttributesCount;
	AttributesInfo TheAttributes[];

	
}
