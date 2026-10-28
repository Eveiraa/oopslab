public class WrapperClassDemo {

    public static void main(String[] args){
        int primitiveInt = 100;
        float primitiveFloat = 25.75f;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;
        Integer wrappedInt = primitiveInt;
        Float wrapppedFloat = primitiveFloat;
        Character wrapppedChar = primitiveChar;
        Boolean wrappedBoolean = primitiveBoolean;
        System.out.println("Autoboxed Integer:"+wrappedInt);
        System.out.println("Autoboxed Float:"+wrapppedFloat);
        System.out.println("Autoboxed Character:"+wrapppedChar);
        System.out.println("Autoboxed Boolean:"+wrappedBoolean);
        int unboxedInt = wrappedInt;
        float unboxedFloat = wrapppedFloat;
        char unboxedChar = wrapppedChar;
        boolean unboxedBoolean = wrappedBoolean;
        System.out.println("Autoboxed int:"+unboxedInt);
        System.out.println("Autoboxed float:"+unboxedFloat);
        System.out.println("Autoboxed char:"+unboxedChar);
        System.out.println("Autoboxed boolean:"+unboxedBoolean);
        String intString = "300";
        Integer parsedInt = Integer.parseInt(intString);
        String floatString = "75.25";
        Float parsedFloat = Float.parseFloat(floatString);
        String charString = "C";
        Character parsedChar = charString.charAt(0);
        String booleanString = "true";
        Boolean parsedBoolean = Boolean.parseBoolean(booleanString);
        System.out.println("Parsed and autoboxed Integer:"+parsedInt);
        System.out.println("Parsed and autoboxed Float:"+parsedFloat);
        System.out.println("Parsed and autoboxed Character:"+parsedChar);
        System.out.println("Parsed and autoboxed Boolean:"+parsedBoolean);
    }
}