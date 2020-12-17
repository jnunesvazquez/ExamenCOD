package com.cod;

/**
 * Mostrar la tabla de multiplicar de un numero
 * @author Joel
 * @version 15.0.1
 */
public class Auxiliar {
    String email;
    String ip = "127.0.0.2";

    //esta va a ser la unica instancia
    /**
     * Instancia nula
     */
    static Auxiliar instance = null;

    /**
     * Constructor sin parametros
     */
    Auxiliar(){
        email = "anonymous@danielcastelao.org";
    }

    /**
     * Constructor con parametros
     * @param parametro1 un correo
     */
    Auxiliar(String parametro1){
        this.email = parametro1;
    }

    /**
     * Metodo getInstance()
     * @return instance
     */
    public static Auxiliar getInstance() {
        // compruebo si ya está creada
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            instance = new Auxiliar();
        }
        // devuelvo la instancia
        return instance;
    }

    /**
     * Metodo de validacion
     * @return true or false
     */
    public boolean con() {
        if (email != "anonymous@danielcastelao.org") {
            return true;
        }
        else {
            return false;
        }
    }
}
