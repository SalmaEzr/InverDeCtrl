package pres;

import metier.IMetier;
import org.springframework.*;

public class PresSpringXml {
    public static void main(String[] args){
    ApplicationContext context= new ApplicationContext("applicationContext.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println("resultat=>"+metier.calcul());
    }
}
