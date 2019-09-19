package rs.itbootcamp.gen4.nedelja4.pozoriste;
//Program.java

public class Program { 
 public static void main(String[] argv){
     Pozoriste p =  new Pozoriste("Jugoslovensko dramsko pozorište");
     Repertoar r = new Repertoar (p);
     Predstava p1 = new Predstava("Princeza na zrnu graska", p, new Reditelj("Iva Milosevic", p));
     p1.dodaj(new Kostimograf("Maja Mirkovic", p));
     p1.dodaj(new Glumac("Jovo Maksic", p));
     Predstava p2 = new Predstava("Cudne ljubavi", p, new Reditelj("Djurdja Tesic", p));
     p2.dodaj(new Kostimograf("Zorana Petrov", p));
     p2.dodaj(new Glumac("Milos Samolov", p));
     p2.dodaj(new Glumac("Jelena Ilic", p));
     p2.dodaj(new Glumac("Sandra Rodic", p));
     r.dodaj(p1);
     r.dodaj(p2);
     System.out.print(r);
 }
} 