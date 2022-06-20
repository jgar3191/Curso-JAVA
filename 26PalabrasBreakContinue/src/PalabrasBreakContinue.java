public class PalabrasBreakContinue {
    public static void main(String[] args) {

        for(int contador= 0;contador <3 ;contador++){
            if(contador % 2 != 0){
               continue;
            }
            System.out.println("contador = " + contador);
            break;
        }

    }
}
