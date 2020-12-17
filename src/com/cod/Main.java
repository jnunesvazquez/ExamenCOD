package com.cod;

public class Main {

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

    public static boolean metodo1(String parametro1) {
        //cambiamos el objeto para instanciar el metodo Singleton
        Auxiliar instaciaAuxiliar1 = Auxiliar.getInstance();
        System.out.println("Conectando a " + instaciaAuxiliar1.ip + ", con el usuario " + parametro1);
        return instaciaAuxiliar1.con();
    }

    public static boolean metodo2() {
        //tambien lo hacemos en el metodo 2
        Auxiliar instanciaAuxiliar2 = Auxiliar.getInstance();
        System.out.println("Conectando a " + instanciaAuxiliar2.ip + ", con el usuario " + instanciaAuxiliar2.email);
        return instanciaAuxiliar2.con();
    }
}
