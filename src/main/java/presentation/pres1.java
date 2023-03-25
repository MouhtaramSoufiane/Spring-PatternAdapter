package presentation;

import dao.IDao;
import dao.ImplDao;
import metier.IMetier;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        ImplDao dao=new ImplDao();
        MetierImpl metier=new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.println("Res : "+metier.calcul());

    }
}
