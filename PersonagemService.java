/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amanda Cardoso
 */
public class PersonagemService {
    class PersonagemService {

    public static PersonagemDragonBall criarKuririn() {
        return new Terraqueo("Kuririn", 30, "M", "Dragon Ball Z", 6000, "Kienzan", "Terra", "Kame House");
    }

    public static PersonagemDragonBall criarGoku() {
        return new Sayajin("Goku", 38, "M", "Dragon Ball Super", 12000000, "Kamehameha", 3, true);
    }

    public static PersonagemDragonBall criarGohan() {
        return new Sayajin("Gohan", 25, "M", "Dragon Ball Super", 7000000, "Masenko", 2, true);
    }

    public static PersonagemDragonBall criarDende() {
        return new Namekuseijin("Dende", 250, "M", "Dragon Ball Z", 1000, "Cura", 3, true);
    }

    public static void evoluirGokuSuperSayajin5(Sayajin goku) {
        if (goku.transformar(5).equals("Não foi possível transformar esse sayajin")) {
            System.out.println("Goku não conseguiu se transformar em Super Sayajin 5.");
        }
    }

    public static void evoluirGohanSuperSayajin3(Sayajin gohan) {
        if (gohan.transformar(5).equals("Não foi possível transformar esse sayajin")) {
            gohan.transformar(3);
            System.out.println("Gohan se transformou em Super Sayajin 3.");
        } else {
            gohan.transformar(5);
            System.out.println("Gohan se transformou em Super Sayajin 5.");
        }
    }

    public static String fazerDesejoDende(Namekuseijin dende, String desejo) {
        String desejoNamekusei = "";
        for (String palavra : desejo.split(" ")) {
            if (palavra.equalsIgnoreCase("força")) {
                desejoNamekusei += "naraku ";
            } else if (palavra.equalsIgnoreCase("poder")) {
                desejoNamekusei += "ki ";
            } else if (palavra.equalsIgnoreCase("saúde")) {
                desejoNamekusei += "zenkai ";
            } else if (palavra.equalsIgnoreCase("felicidade")) {
                desejoNamekusei += "eikou ";
            } else if (palavra.equalsIgnoreCase("paz")) {
                desejoNamekusei += "heiwa ";
            }
        }
        return "Desejo em Namekusei: " + desejoNamekusei;
    }
}

    
}
