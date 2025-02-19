package com.tva.services;

import com.tva.entities.Editorial;
import com.tva.persistency.EditorialDAO;
import java.util.Iterator;

public class EditorialServicio {
    public static void main(String[] args) {
        // System.out.print(CLEAR);
        EditorialDAO eDao = new EditorialDAO();




        Editorial edit = new Editorial("Alfaguara");
        // Editorial edit = eDao.findEditorial(2);
        // edit.setAlta(false);
        
        eDao.guardaEditorial(edit);
        // eDao.eliminarEditorial(1);



        Iterator<Editorial> it = eDao.findEditoriales().iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
