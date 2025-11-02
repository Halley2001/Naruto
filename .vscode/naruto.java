import java.util.Scanner;

public class naruto {

    public static void main(String[] args) {

    String usuario = "";
    String contraseña = "";
    Scanner sc = new Scanner(System.in);

    do {
        System.out.println("\nIntroduce tu usuario: ");
        usuario = sc.nextLine();

        System.out.println("\nIntroduce tu contraseña: ");
        contraseña = sc.nextLine();

    if (usuario.equalsIgnoreCase("Hokage") && contraseña.equalsIgnoreCase("Naruto")) {
        System.out.println("Hola muy buenas");
    } else {
        System.out.println("\n--->Contraseña o usuario erroneo. Prueba de nuevo<---");
    }

    } while (!usuario.equalsIgnoreCase("Hokage") || !contraseña.equalsIgnoreCase("Naruto"));
    
    sc.close();
}
    // Esto es una prueba.
}
