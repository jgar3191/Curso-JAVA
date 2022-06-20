public class Etiquetas {
    public static void main(String[] args) {

        inicio:
        for(int contador= 0;contador <3 ;contador++){
            if(contador % 2 != 0){
                continue inicio;
            }
            System.out.println("contador = " + contador);
        }

    }
}