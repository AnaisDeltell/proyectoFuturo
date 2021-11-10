package proyectofuturo_anaisdeltell;

public class ProyectoFuturo_AnaisDeltell {
//Anais Deltell
    static String media = "5";

    static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        } else if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar mas tiempo.";
        } else {
            return "Ideal. trabajas los contenidos en casa.";
        }

    }

    public static void main(String[] args) {

        System.out.println("Estudiante: " + args[0] + ".");
        System.out.println(veredicto(args[2], media));

    }

}
