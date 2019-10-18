package Herencia;


public class Principal {
    public static void main(String[] args) {
        Abuelo abu = new Abuelo("Osvaldo", "m", 67);
        Padre pa = new Padre("Juan", "m", 40);

        System.out.println(abu.genero);
        System.out.println(pa.nada());
    }
}
