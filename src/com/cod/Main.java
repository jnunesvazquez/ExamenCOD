package com.cod;

/**
 * Mostrar la tabla de multiplicar de un numero
 * @author Joel
 * @version 15.0.1
 */
public class Main {
    /**
     * Programa para comprobar correos
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        if (metodo1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        }
        else {
            System.out.println("Fallo");
        }
        if (metodo2()) {
            System.out.println("Listo");
        }
        else {
            System.out.println("Fallo");
        }
    }

    /**
     * Metodo para instanciar los correos y validarlos
     * @param parametro1 correo del usuario
     * @return instanciaAuxiliar1.con()
     */
    public static boolean metodo1(String parametro1) {
        //cambiamos el objeto para instanciar el metodo Singleton
        Auxiliar instaciaAuxiliar1 = Auxiliar.getInstance();
        System.out.println("Conectando a " + instaciaAuxiliar1.ip + ", con el usuario " + parametro1);
        return instaciaAuxiliar1.con();
    }

    /**
     * Otro metodo para comprobar y validar otro correo
     * @return instanciaAuxiliar2.con()
     */
    public static boolean metodo2() {
        //tambien lo hacemos en el metodo 2
        Auxiliar instanciaAuxiliar2 = Auxiliar.getInstance();
        System.out.println("Conectando a " + instanciaAuxiliar2.ip + ", con el usuario " + instanciaAuxiliar2.email);
        return instanciaAuxiliar2.con();
    }
}
