
class Eleman {

    char icerik;
    Eleman ileri;
    Eleman geri;

    Eleman(char icerik) {
        this.icerik = icerik;
        ileri = null;
        geri = null;
    }
}

public class stack {

    private Eleman ust;

    stack() {
        ust = null;
    }

    boolean bosMu() {
        return ust == null;
    }

    void push(char icerik) {
        Eleman tmp = new Eleman(icerik);
        if (bosMu()) {
            ust = tmp;
        } else {
            ust.ileri = tmp;
            tmp.geri = ust;
            ust = tmp;
        }

    }

    void pop() {
        ust = ust.geri;
    }

    Eleman getTop() {
        return ust;
    }

    void print() {
        Eleman tmp;
        tmp = ust;
        while (tmp != null) {
            System.out.print("yigit" + tmp.icerik);
            tmp = tmp.geri;
        }
        System.out.println("");
    }

}
