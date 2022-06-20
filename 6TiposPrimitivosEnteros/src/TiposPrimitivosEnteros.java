public class TiposPrimitivosEnteros {
    public static void main(String []args){
        /*
            Tipos Primitivos Enteros: byte, short, int, long
        */
        //BYTE
        byte numByte = (byte) 129; //En este caso excede el rango max y hay que hacer una Conversion de tipos para que quepa
        System.out.println("numByte = " + numByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE); //-128
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);// 127

        //SHORT
        short numShort = (short)32768;
        System.out.println("\nnumShort = " + numShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE); // -32768
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);// 32767

        //INT
        int numInt = (int)2147483648L; //En el caso de int se debe usar la literal L por ser superior a un tipo entero
        System.out.println("\nnumInt = " + numInt);
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);// 2147483647

        //LONG
        long numLong1 = (long) 9223372036854775808F; //En el caso de exceder hay que usar flotantes
        long numLong2 = 9223372036854775807L; //Necesita la literal L para indicarle al compilador
        System.out.println("\nnumLong1 = " + numLong1);
        System.out.println("numLong2 = " + numLong2);
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);// 9223372036854775807

    }
}
