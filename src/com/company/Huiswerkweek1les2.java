package com.company;

public class Huiswerkweek1les2 {

    public static void main(String[] args) {
//        opgave 2
        Auto auto1 = new Auto();
        auto1.setMerk("Tesla");
        auto1.setPk(15);
        auto1.setType("Model 3");
//        opgave 4
        System.out.println(auto1.getMerk());
        System.out.println(auto1.getPk());
        System.out.println(auto1.getType());
//        Opgave 5 6 -> Powerpoint
        System.out.println(auto1);
//        opgave 7

        Auto mijnAuto = new Auto();
        mijnAuto.setMerk("Tesla");
        mijnAuto.setType("S");
        mijnAuto.setPk(400);

        Aanhanger eenAanhanger = new Aanhanger();
        eenAanhanger.setLengte(3);
        eenAanhanger.setAantalWielen(4);
        mijnAuto.setAanhanger(eenAanhanger);

        System.out.println("aanhanger lengte = " + mijnAuto.getAanhanger().getLengte());

        Auto jouwAuto = new Auto();
        jouwAuto.setPk(42);
        jouwAuto.setType("waardeloos");
        jouwAuto.setMerk("Lelijk eentje");
        Auto onzeAuto;

        if (true) {
            onzeAuto = mijnAuto;
            onzeAuto.setPk(mijnAuto.getPk()+ jouwAuto.getPk());
            onzeAuto.setMerk("Volkswagen");
            onzeAuto.setType(mijnAuto.getType() + " & " + jouwAuto.getType());

        }
        else
        {
//            Opdracht 7B
            onzeAuto = new Auto();
            onzeAuto.setPk(mijnAuto.getPk()+ jouwAuto.getPk());
            onzeAuto.setMerk("Volkswagen");
            onzeAuto.setType(mijnAuto.getType() + " & " + jouwAuto.getType());

        }

        Auto dezeAuto = mijnAuto;

        dezeAuto.setMerk(dezeAuto.getMerk() +  " (geweldig)");
        dezeAuto.setPk(dezeAuto.getPk() + 100);
        System.out.println();
        System.out.println("==== mijn auto ====");
        System.out.println(" - merk = " + dezeAuto.getMerk());
        System.out.println(" - type = " + dezeAuto.getType());
        System.out.println(" - pk = " + dezeAuto.getPk());

        dezeAuto = jouwAuto;   // wat gebeurt hier?

        dezeAuto.setMerk(dezeAuto.getMerk()+ " (waardeloos)");
        dezeAuto.setPk(dezeAuto.getPk() - 10);

        System.out.println();
        System.out.println("++++ jouw auto ++++");
        System.out.println(" - merk = " + dezeAuto.getMerk());
        System.out.println(" - type = " + dezeAuto.getType());
        System.out.println(" - pk = " + dezeAuto.getPk());

        dezeAuto = onzeAuto;

        System.out.println();
        System.out.println("+=+= onze auto +=+=");
        System.out.println(" - merk = " + dezeAuto.getMerk());
        System.out.println(" - type = " + dezeAuto.getType());
        System.out.println(" - pk = " + dezeAuto.getPk());


    }
}
//Opdracht 8B Ja dan veranderd die waarde ook