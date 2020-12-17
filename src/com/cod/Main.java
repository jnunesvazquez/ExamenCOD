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
        Auxiliar obxetoAuxiliar1 = new Auxiliar(parametro1);
        System.out.println("Conectando a " + obxetoAuxiliar1.ip + ", con el usuario " + parametro1);
        return obxetoAuxiliar1.con();
    }

    public static boolean metodo2() {
        Auxiliar obxetoAuxiliar2 = new Auxiliar();
        System.out.println("Conectando a " + obxetoAuxiliar2.ip + ", con el usuario " + obxetoAuxiliar2.email);
        return obxetoAuxiliar2.con();
    }
}
