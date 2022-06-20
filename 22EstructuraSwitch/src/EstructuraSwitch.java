public class EstructuraSwitch {
    public static void main(String[] args) {
        numeros();
        estaciones();
    }

    private static void estaciones() {
        var mes = 1;
        var estacion = "Estacion desconocida";

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }

        System.out.println("estacion = " + estacion);
    }

    private static void numeros() {
        var numero = 3;
        var numeroTexto = "Desconocido";

        switch (numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
