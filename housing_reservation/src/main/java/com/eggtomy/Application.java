package com.eggtomy;
import com.eggtomy.persistency.*;
// import com.eggtomy.entities.*;
// import java.sql.Date;

public class Application {
    public static final String CLEAR = "\033[H\033[2J";
    public static void main(String[] args) {
        System.out.print(CLEAR);
        CasaDAO cd = new CasaDAO();
        cd.readCasas();
        // Casa newCasa = new Casa("Londo",11,"320","Dublin","Irlanda",Date.valueOf("2025-01-01"),Date.valueOf("2025-02-25"),4,10,50.15f,"Chalet");
        // cd.addCasa(newCasa);
        cd.deleteCasa(9);
        System.out.println("-------------");
        cd.readCasas();
        cd.close();
    }
}
