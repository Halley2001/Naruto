import java.util.Scanner;

public class naruto {

    public static void main(String[] args) {

        //Variables definidas
        String usuario;
        String contraseña;
        Scanner sc = new Scanner(System.in);
        int personajes = 0;

        //Condicional para que se repita el bucle mientras las creedenciales no sean las correctas " Usuario = Hokage, Contraseña = Ninja."
        do {
            System.out.println("\nIntroduce tu usuario: ");
            usuario = sc.nextLine();

            System.out.println("\nIntroduce tu contraseña: ");
            contraseña = sc.nextLine();

        //El ignoreCase sirve para poder meter mayusculas y minusculas. HOKAGE o Hokage, la contraseña es igual.
            if (usuario.equalsIgnoreCase("Hokage") && contraseña.equalsIgnoreCase("Ninja")) {
                System.out.println("\nElige entre los siguientes personajes");
            } else {
                System.out.println("\n--->Contraseña o usuario erroneo. Prueba de nuevo<---");
            }

        } while (!usuario.equalsIgnoreCase("Hokage") || !contraseña.equalsIgnoreCase("Ninja"));

        //otro bucle para que solo puedas elegir entre 1, 2, 3. Si metes una letra u otro numero, no te va a dejar (se repite el bucle).
        do {
            System.out.println("\n-->Personajes: \n1.Naruto. \n2.Sasuke. \n3.Sakura");
            if (sc.hasNextInt()) {
                personajes = sc.nextInt();

                switch (personajes) {
                    case 1: System.err.println("\nNaruto:" +
                            "\n" + //
                            "Ataque - Rasengan: Esfera de chakra giratoria que causa un poderoso daño concentrado al impactar.\n"
                            + //
                            "\n" + //
                            "Defensa - Modo Sabio: Aumenta los sentidos y la resistencia, permitiendo anticipar y resistir ataques.\n"
                            + //
                            "\n" + //
                            "Objetos - Pergaminos Ninja: Sellan y liberan armas, invocaciones o técnicas según lo necesite en combate.");
                            break;

                    case 2: System.err.println("\nSasuke:" +
                            "\n" + //
                            "Ataque - Chidori: Concentración de chakra eléctrico en la mano que atraviesa al enemigo con velocidad.\n"
                            + //
                            "\n" + //
                            "Defensa - Sharingan: Permite anticipar movimientos enemigos y copiar técnicas para esquivar o contraatacar.\n"
                            + //
                            "\n" + //
                            "Objetos - Shuriken Demoníaco: Arma arrojadiza de gran tamaño usada junto con técnicas de fuego o relámpago..");
                            break;

                    case 3: System.out.println("\nSakura:" +
                            "\n" + //
                            "Ataque - Golpe de Chakra: Descarga de fuerza concentrada que destruye el terreno o incapacita al rival.\n"
                            + //
                            "\n" + //
                            "Defensa - Regeneración Celular: Usa su chakra almacenado para curarse rápidamente durante la batalla.\n"
                            + //
                            "\n" + //
                            "Objetos - Guantes de Combate: Refuerzan sus puños para canalizar y controlar mejor la energía en los ataques.");
                            break;
                    default: System.out.println("Por favor, introduce un numero del 1 al 3");
                }

                }else {
                    System.out.println("\nPor favor introduce un número válido.");
                    sc.next();
                }
            } while (personajes<1 || personajes>3);
            sc.close();
        }
    }
