package com.eggtomy;
import com.eggtomy.entities.*;
// import java.sql.Date;
import java.util.List;
import com.eggtomy.services.FamiliaService;

public class Application {
    public static final String CLEAR = "\033[H\033[2J";
    public static void main(String[] args) {
        System.out.print(CLEAR);
        menu(1);
        
    }

    public static void menu(int opcion){
        switch (opcion) {
            case 1:
                opcion1();
                break;
        
            default:
                break;
        }
    }

    public static void opcion1(){
        FamiliaService fs = new FamiliaService();
        List <Familia> familias = fs.buscaEdadMaxima(10);
        familias = fs.buscaNumeroHijos(3,familias);
        fs.showFamilias(familias);
    }
}
