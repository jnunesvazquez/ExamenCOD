package com.cod;

public class Auxiliar {
    String email;
    String ip = "127.0.0.2";

    Auxiliar(){
        email = "anonymous@danielcastelao.org";
    }

    Auxiliar(String parametro1){
        this.email = parametro1;
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
