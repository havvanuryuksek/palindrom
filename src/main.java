
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        queue kuyruk = new queue();
        stack yigit = new stack();
        String kelime=scan.nextLine();
        
        for (int i = 0; i < kelime.length(); i++) {
            kuyruk.add(kelime.charAt(i));
            yigit.push(kelime.charAt(i));

        }

        if (pallindrom(kuyruk, yigit)) {
            System.out.println(kelime + " kelimesi Pallindromdur");
        } else {
            System.out.println(kelime + " kelimesi Pallindrom değil");
        }
    }

    static boolean pallindrom(queue kuyruk, stack yigit) {
        boolean esit = true;
        while (!kuyruk.bosMu() || !yigit.bosMu()) {
            if (yigit.getTop().icerik==kuyruk.getTop().icerik) {
                yigit.pop();
                kuyruk.remove();
            } else {
                esit = false;
                break;

            }

        }
        return esit;

    }

}
