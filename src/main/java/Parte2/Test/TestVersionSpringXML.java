package Parte2.Test;

import Parte2.Adapter.Adapter;
import Parte2.HDMI;
import Parte2.TV;
import Parte2.USB;
import Parte2.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVersionSpringXML {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
        TV tv=context.getBean(TV.class);
        UniteCentrale uniteCent=context.getBean(UniteCentrale.class);
        Adapter adapter=context.getBean(Adapter.class);

        adapter.setHdmi(tv);
        uniteCent.setVga(adapter);
        uniteCent.printData("salam");

    }



}
