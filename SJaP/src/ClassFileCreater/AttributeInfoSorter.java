package ClassFileCreater;

import java.io.DataOutputStream;
import java.io.IOException;

import ClassFileCreater.ClassAttributesClasses.ExceptionContent;

public class AttributeInfoSorter {
	public static void AttributesInfoWriter(DataOutputStream TheStream, 
		AttributesInfo TheInfo) throws IOException {
			switch(TheInfo.Identifier){
				case("ConstantValueAttribute"):
					
					TheStream.writeShort(TheInfo.AttributeIndex);
					TheStream.writeInt(TheInfo.AttributeLength);
					TheStream.writeShort(TheInfo.ConstantValueIndex);
					break;
				case("CodeAttribute"):
					
					TheStream.writeShort(TheInfo.TheCodeAttribute.MaxStack);
					TheStream.writeShort(TheInfo.TheCodeAttribute.MaxLocals);
					TheStream.writeInt(TheInfo.TheCodeAttribute.CodeLength);
					for(byte TheCodeBytes : TheInfo.TheCodeAttribute.TheCode){
						TheStream.write(TheCodeBytes);
					}
					TheStream.writeShort(TheInfo.TheCodeAttribute.ExceptionTableLength);
					for(ExceptionContent TheExceptionContent : TheInfo.TheCodeAttribute.ExceptionTable){
						TheStream.writeShort(TheExceptionContent.StartPc);
						TheStream.writeShort(TheExceptionContent.EndPc);
						TheStream.writeShort(TheExceptionContent.HandlerPc);
						TheStream.writeShort(TheExceptionContent.CatchType);
					}
					TheStream.writeShort(TheInfo.TheCodeAttribute.AttributesCount);
					for(AttributesInfo TheAttributes : TheInfo.TheCodeAttribute.TheAttributes){
						AttributesInfoWriter(TheStream,TheAttributes);
					}
					break;
				case("StackMapFrame"):
					TheInfo.StackMapFrameAttribute.WriteFrame(TheStream);
					break;
				case("ExceptionAttribute"):
					
					TheStream.writeShort(TheInfo.TheExceptionAttribute.NameIndex);
					TheStream.writeInt(TheInfo.TheExceptionAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.TheExceptionAttribute.NumberExceptions);
					for(int i = 0; i < TheInfo.TheExceptionAttribute.NumberExceptions; i++)
						TheStream.writeShort(TheInfo.TheExceptionAttribute.ExceptionTable[i]);
					break;
				case("InnerClasses"):
					
					TheStream.writeShort(TheInfo.InnerClassesAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.InnerClassesAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.InnerClassesAttribute.NumberOfClasses);
					for(int i = 0; i < TheInfo.InnerClassesAttribute.NumberOfClasses; i++){
						TheStream.writeShort(TheInfo.InnerClassesAttribute.Classes.InnerClassInfoIndex);
						TheStream.writeShort(TheInfo.InnerClassesAttribute.Classes.OuterClassInfoIndex);
						TheStream.writeShort(TheInfo.InnerClassesAttribute.Classes.InnerNameIndex);
						TheStream.writeShort(TheInfo.InnerClassesAttribute.Classes.InnerClassAccessFlags);
					}
					
					break;
				case("EnclosingMethod"):
					
					TheStream.writeShort(TheInfo.EnclosingMethodAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.EnclosingMethodAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.EnclosingMethodAttribute.ClassIndex);
					TheStream.writeShort(TheInfo.EnclosingMethodAttribute.MethodLength);
					
					
					break;
				case("Synthetic"):
					
					TheStream.writeShort(TheInfo.SyntheticAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.SyntheticAttribute.AttributeLength);
					break;
				case("Signature"):
					TheStream.writeShort(TheInfo.SignatureAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.SignatureAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.SignatureAttribute.SignatureIndex);
					break;
				case("SourceFile"):
					TheStream.writeShort(TheInfo.SourceFileAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.SourceFileAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.SourceFileAttribute.SourceFileIndex);
					break;
				case("SourceDebugExtension"):
					TheStream.writeShort(TheInfo.SourceDebugExtensionAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.SourceDebugExtensionAttribute.AttributeLength);
					for(byte TheBytes : TheInfo.SourceDebugExtensionAttribute.DebugExtension){
						TheStream.write(TheBytes);
					}
					break;
				case("LineNumberTable"):
					TheStream.writeShort(TheInfo.LineNumberTableAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.LineNumberTableAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.LineNumberTableAttribute.LineNumberTableLength);
					for(int i = 0; i < TheInfo.LineNumberTableAttribute.LineNumberTableLength; i++){
						TheStream.writeShort(TheInfo.LineNumberTableAttribute.LineNumberTableStartPc[i]);
						TheStream.writeShort(TheInfo.LineNumberTableAttribute.LineNumberTableLineNumber[i]);
					}
					break;
				case("LocalVariableTable"):
					TheStream.writeShort(TheInfo.LocalVariableTableAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.LocalVariableTableAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.LocalVariableTableAttribute.LocalVariableTableLength);
					for(int i= 0; i < TheInfo.LocalVariableTableAttribute.LocalVariableTableLength; i++){
						TheStream.writeShort(TheInfo.LocalVariableTableAttribute.TheTable[i].StartPc);
						TheStream.writeInt(TheInfo.LocalVariableTableAttribute.TheTable[i].Length);
						TheStream.writeShort(TheInfo.LocalVariableTableAttribute.TheTable[i].NameIndex);
						TheStream.writeShort(TheInfo.LocalVariableTableAttribute.TheTable[i].DescriptorIndex);
						TheStream.writeShort(TheInfo.LocalVariableTableAttribute.TheTable[i].Index);
					}
					break;
				case("LocalVariableTypeTable"):
					TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.LocalVariableTypeTableAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.LocalVariableTypeTableLength);
					for(int i = 0; i < TheInfo.LocalVariableTableAttribute.LocalVariableTableLength; i++){
						TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.TheTable[i].StartPc);
						TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.TheTable[i].Length);
						TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.TheTable[i].NameIndex);
						TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.TheTable[i].SignatureIndex);
						TheStream.writeShort(TheInfo.LocalVariableTypeTableAttribute.TheTable[i].Index);
					}
					break;
				case("Deprecated"):
					TheStream.writeShort(TheInfo.DeprecatedAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.DeprecatedAttribute.AttributeLength);
					break;
				case("RuntimeVisibleAnnotation"):
					TheStream.writeShort(TheInfo.RunTimeVisibleAnnotationAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.RunTimeVisibleAnnotationAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.RunTimeVisibleAnnotationAttribute.NumAnnotation);
					for(int i = 0; i < TheInfo.RunTimeVisibleAnnotationAttribute.NumAnnotation; i++)
						TheInfo.RunTimeVisibleAnnotationAttribute.TheAnnotations[i].WriteAnnotation(TheStream);
					break;
				case("ElementValue"):
					TheInfo.ElementValueAttribute.WriteElementValue(TheStream);
				 	break;
				case("RunTimeInvisibleAnnotation"):
					TheStream.writeShort(TheInfo.RunTimeInvisibleAnnotationAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.RunTimeInvisibleAnnotationAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.RunTimeInvisibleAnnotationAttribute.NumAnnotations);
					for(int i = 0; i < TheInfo.RunTimeInvisibleAnnotationAttribute.NumAnnotations; i++){
						TheInfo.RunTimeInvisibleAnnotationAttribute.TheAnnotations[i].WriteAnnotation(TheStream);
					}
					break;
				case("RunTimeVisibleParameterAnnotation"):
					TheStream.writeShort(TheInfo.RunTimeVisibleParameterAnnotationAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.RunTimeVisibleParameterAnnotationAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.RunTimeVisibleParameterAnnotationAttribute.NumParameters);
					for(int i = 0; i < TheInfo.RunTimeVisibleParameterAnnotationAttribute.NumParameters; i++){
						TheStream.writeShort(TheInfo.RunTimeVisibleParameterAnnotationAttribute.TheParameterAnnotations[i].NumAnnotations);
						for(int j = 0; j < TheInfo.RunTimeVisibleParameterAnnotationAttribute.TheParameterAnnotations[i].NumAnnotations; j++)
							TheInfo.RunTimeVisibleParameterAnnotationAttribute.TheParameterAnnotations[i].TheAnnotations[j].WriteAnnotation(TheStream);
					}
					break;
				case("RunTimeInvisibleParameterAnnotation"):
					TheStream.writeShort(TheInfo.RunTimeInvisibleParameterAnnotationAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.RunTimeInvisibleParameterAnnotationAttribute.AttributeLength);
					TheStream.write(TheInfo.RunTimeInvisibleParameterAnnotationAttribute.NumParameters);
					for(int i = 0; i < TheInfo.RunTimeInvisibleParameterAnnotationAttribute.NumParameters; i++){
						TheStream.writeShort(TheInfo.RunTimeInvisibleParameterAnnotationAttribute.TheParameterAnnotations[i].NumAnnotations);
						for(int j = 0; i < TheInfo.RunTimeInvisibleParameterAnnotationAttribute.TheParameterAnnotations[i].NumAnnotations; j++)
							TheInfo.RunTimeInvisibleParameterAnnotationAttribute.TheParameterAnnotations[i].TheAnnotations[j].WriteAnnotation(TheStream);
					}
					break;
				case("AnnotationDefault"):
					TheStream.writeShort(TheInfo.AnnotationDefaultAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.AnnotationDefaultAttribute.AttributeLength);
					TheInfo.AnnotationDefaultAttribute.DefaultValue.WriteElementValue(TheStream);
					break;
				case("BootStrapMethods"):
					TheStream.writeShort(TheInfo.BootStrapMethodAttribute.AttributeNameIndex);
					TheStream.writeInt(TheInfo.BootStrapMethodAttribute.AttributeLength);
					TheStream.writeShort(TheInfo.BootStrapMethodAttribute.NumBootStrapMethods);
					for(int i = 0; i < TheInfo.BootStrapMethodAttribute.NumBootStrapMethods; i++){
						TheStream.writeShort(TheInfo.BootStrapMethodAttribute.TheBootStrapMethods[i].BootStrapMethodRef);
						TheStream.writeShort(TheInfo.BootStrapMethodAttribute.TheBootStrapMethods[i].NumBootStrapArguments);
						for(int j = 0; j < TheInfo.BootStrapMethodAttribute.TheBootStrapMethods[i].NumBootStrapArguments; i++)
							TheStream.writeShort(TheInfo.BootStrapMethodAttribute.TheBootStrapMethods[i].BootStrapArguments[j]);
					}
					break;
				default:
					//errorhandling???
						
			}
		}
		
	}
	

