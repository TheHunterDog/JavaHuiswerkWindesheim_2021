package com.company.oefentoets;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.Assert;

public class MeldingTest {
    public static void main(String[] args){
        Melding krok = new Melding("De kroketten zijn op!",1,"vandaag",LocalDate.now(),LocalDate.now().getDayOfWeek());
        System.out.println(krok);
        Melding kan = new Melding("De kantine is geslo ",2,"vandaag",LocalDate.now(),LocalDate.now().getDayOfWeek());
        System.out.println(kan);
        Melding ker = new Melding("Kerst is nabij",1525123341);
        System.out.println(ker);
        ker.setAangepasteDag(LocalDate.now().getDayOfWeek().plus(3));
        System.out.println(ker);
        ker.setAangepasteDag(DayOfWeek.FRIDAY);
        System.out.println(ker);
        Assert.assertTrue(ker.equals(kan));

    }
}
