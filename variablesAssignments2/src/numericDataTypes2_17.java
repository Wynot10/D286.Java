public class numericDataTypes2_17 {
    public static void main(String[] args) {

        //Integer Numeric

        byte myByte = 127; // byte data type can hold -128 to 127
        short myShort = 32_767; // Short data type can hold -32,768 to 32,767
        int myInt = 2_147_483_647; // Integer data type can hold -2,147,483,648 to 2,147,483,647

        //Must explicitly tell Java variable is of long type hence the L at the end.
        long myLong = 9_223_372_036_854_775_807L; // Long data type can hold -9,223,372,036,854,775,808 to 9,223,036,854,775,807

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);

        // Floating-point Numeric

        // Note the explicit f at the end to signify float type
        float myFloat = 3.145647f;
        double myDouble = 3.145647;
        System.out.print("myFloat: ");
        System.out.printf("%.3f\n", myFloat);
        System.out.print("myDouble: ");
        System.out.printf("%.3f\n", myDouble);


    }
}
