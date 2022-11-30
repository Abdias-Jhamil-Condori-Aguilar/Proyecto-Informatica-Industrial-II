import java.util.Date;

public class Main {
     public static void main(String [] args){

         Monitores lg1088 = new Monitores("lg1088","Monitor Samsung32",10,"HD");
         lg1088.reset();
         Impresora as44 = new Impresora("as44","Epson",1000);
         as44.reset();
         DiscoDuro ddr =new DiscoDuro("ddr","DDR4",14,3560);
         ddr.reset();
         Date fecha1=new Date();
         System.out.println(fecha1);
         Empresa asus=new Empresa("AJ","Sacaba",50);
         CPUs a4s4=new CPUs("as4s4","Delux","EEUU",fecha1,asus,3560);
         a4s4.reset();
}
}
