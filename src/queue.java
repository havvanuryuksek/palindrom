
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

public class queue {

    private Eleman bas;
    private Eleman son;

    queue() {
        bas = null;
        son = null;
    }

    boolean bosMu() {
        return bas == null;
    }

    void add(char icerik) {
        Eleman tmp = new Eleman(icerik);
        if (bas == null) {
            bas = tmp;
            son = tmp;
        } else {
            son.ileri = tmp;
            son = tmp;
        }
    }

    void remove() {
        bas = bas.ileri;
    }

    Eleman getTop() {
        return bas;
    }

    void print() {
        Eleman tmp;
        tmp = bas;
        while (tmp != null) {
            System.out.print("sıra" + tmp.icerik);
            tmp = tmp.ileri;
        }
        System.out.println("");
    }

}
