package com.cod;

/**
 * Clase principal para validar correos
 * @author Joel
 * @version 15.0.1
 */
public class Main {
    /**
     * Programa para comprobar correos
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        if (metodoPrimerUsuario("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        }
        else {
            System.out.println("Fallo");
        }
        if (metodoSegundoUsuario()) {
            System.out.println("Listo");
        }
        else {
            System.out.println("Fallo");
        }
    }

    /**
     * Metodo para comprobar los correos y validarlos
     * @param usuario correo del usuario
     * @return AuxiliarPrimerUsuario.con()
     */
    public static boolean metodoPrimerUsuario(String usuario) {
        //cambiamos el objeto para instanciar el metodo Singleton
        Auxiliar AuxiliarPrimerUsuario = Auxiliar.getInstance();
        System.out.println("Conectando a " + AuxiliarPrimerUsuario.ip + ", con el usuario " + usuario);
        return AuxiliarPrimerUsuario.con();
    }

    /**
     * Otro metodo para comprobar y validar otro correo
     * @return AuxiliarSegundoUsuario.con()
     */
    public static boolean metodoSegundoUsuario() {
        //tambien lo hacemos en el metodo del segundo usuario
        Auxiliar AuxiliarSegundoUsuario = Auxiliar.getInstance();
        System.out.println("Conectando a " + AuxiliarSegundoUsuario.ip + ", con el usuario " + AuxiliarSegundoUsuario.email);
        return AuxiliarSegundoUsuario.con();
    }
}
