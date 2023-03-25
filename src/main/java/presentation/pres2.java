package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String ClassDaoName=scanner.nextLine();
        Class cdao=Class.forName(ClassDaoName);
        IDao dao=(IDao) cdao.getConstructor().newInstance();

        String ClassMetierName=scanner.nextLine();
        Class cmetier=Class.forName(ClassMetierName);
        IMetier metier=(IMetier) cmetier.getConstructor().newInstance();

        Method setDao=metier.getClass().getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);

        System.out.println(metier.calcul());


    }
}
