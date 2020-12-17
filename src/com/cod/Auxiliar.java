package com.cod;

public class Auxiliar {
    String email;
    String ip = "127.0.0.2";

    //esta va a ser la unica instancia
    static Auxiliar instance = null;

    Auxiliar(){
        email = "anonymous@danielcastelao.org";
    }

    Auxiliar(String parametro1){
        this.email = parametro1;
    }

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
    public boolean con() {
        if (email != "anonymous@danielcastelao.org") {
            return true;
        }
        else {
            return false;
        }
    }
}
