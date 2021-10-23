public class PrimitiveTypes {

    /***
     *
     * @param args Example of primitive types
     */

    public static void main(String[] args) {

        byte number = 1;
        /**
         *  It is the data type capable of storing 8 bits of information, that is, an integer between -128 and 127
         *  Its use is recommended in case of memory savings, as some types of larger data are processed faster.
         */

        short negativeValue = -32;
        /**
         * It is the type of data that is capable of storing 16-bit integers,
         * that is, an integer between -32,768 and 32,767.
         */

        int age = 10;
        /**
         * It is the type of data capable of storing 32 bits, that is, of representing any integer between
         * -2,147,483,648 and 2,147,483,647.
         * It is the most indicated type in most cases because it has a wide range of values.
         * Variables of this type also tend to be manipulated more quickly as they correspond to the most common (word)
         * data width on most current processors
         */

        long extensive = 50L;
        /**
         * It is the type of data capable of storing 64 bits of information,
         * that is, that can represent any integer between
         * -9.223.372.036.854.775.808L and 9.223.372.036.854.775.807L
         * Its use is recommended only when it is necessary to assume values greater
         * or less than those possible to be assumed by the int.
         */

        float realSimplePrecision = 32.50F;
        /**
         * It is the type of data capable of storing simple precision real numbers,
         * that is, 32 bits of information representing a real number.
         */

        double doublePrecision = 36.25D;
        /**
         * It is the data type capable of storing double precision real numbers,
         * that is, 64 bits of information in the form of a real number.
         * It is used to represent values in which precision is needed greater than that of float.
         */

        boolean on = true;
        /**
         * It is the type of data that contains logical literal. It serves to store a single bit of information.
         * This bit can be represented by the words false or true. Represents binary states, such as:
         * true / false, right / wrong, on / off, open / closed, yes / no etc.
         */

        char character = 'A';
        /**
         * It is the data type capable of storing 16 bits representing characters in UTF-16 format
         * (UTF format composed of two 8-bit characters). Numerically represented,
         * the char type can have values from 0 to 65535 (inclusive) - from '\ u0000' to '\ uffff'.
         * In the most recent versions of the Java language, it is proposed to replace the char type with the byte type.
         */

    }
}
