import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
        for (int i = 0; i < 100; i++) {
            wadah.add(null);
        }
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        } else {
            System.out.println("Index di luar batas!");
            return null;
        }
    }

    public void setIsi(int index, T nilai) {
        if (index >= 0 && index < nbelm) {
            for (int i = 0; i < wadah.size(); i++) {
                if (i == index) {
                    wadah.remove(i);
                    wadah.add(i, nilai);
                    break;
                }
            }
        } else {
            System.out.println("Index di luar batas!");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        if (size >= 0 && size <= wadah.size()) {
            nbelm = size;
        }
    }

    public void add(T nilai) {
        if (nbelm < wadah.size()) {
            for (int i = 0; i < wadah.size(); i++) {
                if (i == nbelm) {
                    wadah.remove(i);
                    wadah.add(i, nilai);
                    nbelm++;
                    break;
                }
            }
        } else {
            System.out.println("Wadah penuh!");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                T next = wadah.get(i + 1);
                wadah.remove(i);
                wadah.add(i, next);
            }
            wadah.remove(nbelm - 1);
            wadah.add(nbelm - 1, null);
            nbelm--;
        } else {
            System.out.println("Index tidak valid untuk delete!");
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(wadah.get(i));
        }
    }
}
