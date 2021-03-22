/**
 * Chris Vo
 * @create 3/21/2021
 *
 * This is the review of overall all of java variable types
 */
public class VariableTypes {

    // basic of creating the main method
    public static void main (String[] args) {
//        System.out.println("Hello\n---");
//        typeInt();
//        typeByte();
//        typeShort();
//        typeLong();
//        castingType();
//        typeFloat();
//        typeDouble();
//        typeChar();
        operateOperand();
    }


    /**
     * DEFINITION:
     * Variables:
     * Primary types: int, double, String, char, boolean
     * Wrapper Class: Integer, String, Character
     *
     * Certain data type take up more spaces than other
     */

    /**
     * Integer:
     * Integer occupies 32 bits
     */
    public static void typeInt() {
        int numb = 5;
        System.out.println(numb);

        numb = ((5 + 10) * 4 )/2;
        System.out.println(numb);

        int value = 1000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("value: " + value);
        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);

        System.out.println("busted min: " + (minValue - 1));
        System.out.println("busted max: " + (maxValue + 1));
    }


    /**
     * Byte: Range is quite smaller.
     * Minimun -128 and max is 127
     * Byte occupies 8 bits.
     * This is only if you want to save memory, or some performance issue
     * For smaller data, it would be quicker to access
     */
    public static void typeByte() {
        byte minValue = Byte.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("byte min: " + minValue);
        System.out.println("byte max: " + maxValue);
    }

    /**
     * Short: Range is quite smaller.
     * Minimun -32768 and max is 32767
     * Short occupies 16 bits
     * Both short and byte have the same unflow and overflow with their own set of range
     */
    public static void typeShort() {
        short minValue = Short.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;
        System.out.println("short min: " + minValue);
        System.out.println("short max: " + maxValue);
    }

    /**
     * Long
     * Long occupied 64 bits (double size of an Interger)
     * Min: -9223372036854775808
     * Max: 9223372036854775807
     */
    public static void typeLong() {
        long value = 100L; // when assign long value, it need to have 'L' at the end of the number
        System.out.println(value);

        long minValue = Long.MIN_VALUE;
        long maxValue = Long.MAX_VALUE;
        System.out.println("long min: " + minValue);
        System.out.println("long max: " + maxValue);

        long bigNumb = 2_147_483_647_234L; // will give error without 'L'
        System.out.println(bigNumb);
    }

    /**
     * Casting: treat or convert a number from one type to another
     */
    public static void castingType() {
        byte minByte = Byte.MIN_VALUE;
        byte byteValue = (byte) (minByte / 2); // will error without casting: int to byte
        System.out.println(byteValue);

        short minShort = Short.MIN_VALUE;
        short shortValue = (short) (minShort / 2);
        System.out.println(shortValue);
    }

    /**
     * Single Precision: 32 bits - 4 bytes
     * Double precision: 64 bits - 8 bytes
     *
     * Float has range: 1.4E-45 to 3.4028235E+38
     * Double has range: 4.9E-324 to 1.7976931348623157E+308
     */
    public static void typeFloat() {
        float minValue = Float.MIN_VALUE;
        float maxValue = Float.MAX_VALUE;
        System.out.println("float min: " + minValue);
        System.out.println("float max: " + maxValue);

        float value = 8f; // add f to confirm tat it is a float
        //float value1 = 2.25; // error: will assume it is a double

        // Generally not recommend using casting (float) isn't used commonly lately, and it is not clean
    }

    /**
     * Double can work with much bigger range of numbers than Float
     * Also more precious than Float
     * But it cost twice memory to store that number (64 bits compare to 32 bits)
     * In some case, using double is much faster than float, because of modern computer chip has pattern using doubles
     *
     */
    public static void typeDouble() {
        double minValue = Double.MIN_VALUE;
        double maxValue = Double.MAX_VALUE;
        System.out.println("double min: " + minValue);
        System.out.println("double max: " + maxValue);

        double value = 2.24d; // d to confirm it is double
    }

    /**
     * String is immutable (can't change the string after it's created)
     * It is inefficinece and not recommended
     * StringBuffer is mutable (can be change)
     */
    public static void typeString() {
        String str = "this string";
        int numb = 10;
        str = str + numb; // not changing, but create new string, old one is discarded
    }

    /**
     * Character: store single character in ''
     * one letter or digit
     * 16 bits, nt just a single bit, allow you to store Unicode characters.
     *
     * Unicode is international encoding stanradr for use with different langauges and script.
     */
    public static void typeChar() {
        char charValue = 'D';
        char charUnicode = '\u0044';
        System.out.println("char value: " + charValue);
        System.out.println("char unicode: " + charUnicode);
    }

    /**
     * Operators: special symbols that perform specific operations on operands, then return the result
     * Operand: term used to describe any object that is manipulated by operator
     * Expression: formed by combining variables, literals, method return values (e.g: 15 + 12, 4 - 2, etc)
     */
    public static void operateOperand() {
        int result = 10 + 5;
        int result1 = 10 % 3;
        int result2 = 100 / 2;
        int result3 = (100 / 4) - 5 * 6;
        System.out.println("result: " + result);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }

}