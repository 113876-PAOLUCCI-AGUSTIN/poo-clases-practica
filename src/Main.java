import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Pajaro cuervo_01 = new Pajaro("Negro","Macho",2,1.10);

        cuervo_01.Vuela();
        cuervo_01.Come();
        cuervo_01.setColorPlumaje("Gris Oscuro");
        System.out.println(cuervo_01.toString());

        Integer a = 5;
        System.out.println();
        System.out.println(Math.random()*100);

    }
}