package com.eggtomy.services;
import com.eggtomy.persistency.FamiliaDAO;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.eggtomy.entities.Familia;

public class FamiliaService extends FamiliaDAO{
    protected FamiliaDAO fd = new FamiliaDAO();
    public FamiliaService(){
        fd.setVerbose(false);
    }

    public FamiliaService(boolean verbose){
        fd.setVerbose(verbose);
    }

    public List<Familia> buscaNumeroHijos(int numHijos, List <Familia>fmas){
        Iterator <Familia> it = fmas.iterator();
        List <Familia> filteredFamList = new ArrayList <Familia>();
        while (it.hasNext()) {
            Familia value = it.next();
            if (value.getNumHijos()>=numHijos) {
                filteredFamList.add(value);
            }
        }
        return filteredFamList;

    }

    public List<Familia> buscaNumeroHijos(int numHijos){
        List<Familia> fmas = fd.readFamilias();
        List <Familia> filteredFamList = new ArrayList <Familia>();
        Iterator <Familia> it = fmas.iterator();
        while (it.hasNext()) {
            Familia value = it.next();
            if (value.getNumHijos()>=numHijos) {
                filteredFamList.add(value);
            }
        }
        return filteredFamList;
    }

    public List<Familia> buscaEdadMaxima(int maxAge){
        List<Familia> fmas = fd.readFamilias();
        List <Familia> filteredFamList = new ArrayList <Familia>();
        Iterator <Familia> it = fmas.iterator();
        while (it.hasNext()) {
            Familia value = it.next();
            if (value.getNumHijos()<maxAge) {
                filteredFamList.add(value);
            }
        }
        return filteredFamList;
    }

    public List<Familia> buscaEdadMaxima(int maxAge,List <Familia>fmas){
        List <Familia> filteredFamList = new ArrayList <Familia>();
        Iterator <Familia> it = fmas.iterator();
        while (it.hasNext()) {
            Familia value = it.next();
            if (value.getNumHijos()<maxAge) {
                filteredFamList.add(value);
            }
        }
        return filteredFamList;
    }


    public void showFamilias(List<Familia> inputList){
        Iterator <Familia> it = inputList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    // public List<Familia> filterFamilias(List<Familia> inputList,String attribute, Object reference){
    //     List <Familia> filteredFamList = new ArrayList <Familia>();
    //     Iterator <Familia> it = inputList.iterator();
    //     while (it.hasNext()) {
    //         if (it.next().getEdadMaxima()<maxAge) {
    //             filteredFamList.add(it.next());
    //         }
    //     }
    //     return filteredFamList;
    // }
    
}
