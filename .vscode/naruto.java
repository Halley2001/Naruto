import java.util.Scanner;
public class naruto {

    public static void main(String[] args) {

        //Variables definidas
        String usuario;
        String contraseña;
        Scanner sc = new Scanner(System.in);

        //personajes
        int personajes = 0;

        //Naruto
        int personaje1 = 1;

        // Ataques
        int ataque1_p1 = +3;  // Rasengan – muy poderoso
        int ataque2_p1 = +1;  // yutsu clones de sombra

        // Defensa
        int defensa_p1 = +2;  // Modo Sabio – buena mejora defensiva

        // Objetos
        int objeto1_p1 = +2;  // Shuriken Demoniaco
        int objeto2_p1 = +1;  // Pergamino de invocación
        int objeto3_p1 = +1;  // pildora verde
        ;


        //Sasuke
        int personaje2 = 2;

        // Ataques
        int ataque1_p2 = +3;  // Chidori – ataque letal
        int ataque2_p2 = +1;  // Katon: Gōkakyū no Jutsu - Bola de fuego 

        // Defensa
        int defensa_p2 = +2;  // Sharingan – anticipa ataques

        // Objetos
        int objeto1_p2 = +2;  // Espada Kusanagi
        int objeto2_p2 = +1;  // Kunai con hilo
        int objeto3_p2 = +1;  // pildora roja


        //Sakura
        int personaje3 = 3;

        // Ataques
        int ataque1_p3 = +2;  // Golpe de Chakra – muy fuerte, pero no tanto como ninjutsu
        int ataque2_p3 = 0;   // Sin segundo ataque importante

        // Defensa
        int defensa_p3 = +3;  // Regeneración Celular – brutalmente defensiva

        // Objetos
        int objeto1_p3 = +1;  // pergamino de armas 
        int objeto2_p3 = +1;  // Venda médica
        int objeto3_p3 = +1;  // pildora amarilla


        //Enemigos 

        //KAguya
        int enemigo1 = 1;

        // Ataques
        int ataque1_e1 = +4;  // Ceniza expansiva
        int ataque2_e1 = +4;  // Manipulación dimensional

        // Defensa
        int defensa_e1 = +4;   // Regeneración + Byakugan + control de chakra

        // Objetos
        int objeto1_e1 = +3;   // Chakra de Ōtsutsuki
        int objeto2_e1 = +2;   // Dimensión propia
        int objeto3_e1 = +2;   // Portal dimensional


        //Zabuza
        int enemigo2 = 2;

        // Ataques
        int ataque1_e2 = +2;  // Decapitación Silenciosa
        int ataque2_e2 = +1;  // Técnica de la niebla oculta

        // Defensa
        int defensa_e2 = +1;  // Resistencia física alta

        // Objetos
        int objeto1_e2 = +2;  // Kubikiribōchō (espada gigante)
        int objeto2_e2 = +1;  // Hilo oculto
        int objeto3_e2 = 0;   // Amuleto estándar


        //Itachi
       int enemigo3 = 3;

        // Ataques
        int ataque1_e3 = +3;  // Amaterasu (fuego negro)
        int ataque2_e3 = +3;  // Tsukuyomi (genjutsu total)

        // Defensa
        int defensa_e3 = +3;  // Susanoo

        // Objetos
        int objeto1_e3 = +2;  // Shuriken Uchiha
        int objeto2_e3 = +2;  // Pergamino explosivo
        int objeto3_e3 = +1;  // Espejo Yata (bono defensivo)


        //Orochimaru 
        int enemigo4 = 4;

        // Ataques
        int ataque1_e4 = +3;  // Lanzas de serpiente
        int ataque2_e4 = +2;  // Técnica del cuerpo de serpiente

        // Defensa
        int defensa_e4 = +3;  // Regeneración + muda de piel

        // Objetos
        int objeto1_e4 = +2;  // Kusanagi
        int objeto2_e4 = +1;  // Poción experimental
        int objeto3_e4 = +1;  // Sellos prohibidos


        //Madara
        int enemigo5 = 5;

        // Ataques
        int ataque1_e5 = +4;  // Susanoo completo
        int ataque2_e5 = +3;  // Meteoro

        // Defensa
        int defensa_e5 = +4;  // Susanoo + cuerpo reanimado

        // Objetos
        int objeto1_e5 = +3;  // Rinnegan
        int objeto2_e5 = +3;  // Sharingan eterno
        int objeto3_e5 = +2;  // Células Hashirama



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


            //Combate
            String [] enemigos = {"Orochimaru", "Kabuto", "Itachi"};
            String ataque1 = "Yutsu clones de sombra"; 
            System.out.println("\nHa aparecido " + enemigos[(int)(Math.random() * enemigos.length)] + " Prepárate para el combate.");

        }
    }