import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
        // Isi awal 100 elemen null agar kita bisa langsung pakai index
        for (int i = 0; i < 100; i++) {
            wadah.add(null);
        }
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index); // masih boleh, tapi bisa diganti dengan loop manual juga kalau diinginkan
        } else {
            System.out.println("Index di luar batas!");
            return null;
        }
    }

    public void setIsi(int index, T nilai) {
        if (index >= 0 && index < nbelm) {
            // manual set menggunakan loop
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

    @SuppressWarnings("unchecked")
    public void setSize(int size) {
        if (size >= 0) {
            if (size > nbelm) {
                char lastChar = 'A' - 1;
                for (int i = nbelm - 1; i >= 0; i--) {
                    T val = wadah.get(i);
                    if (val != null && val instanceof Character) {
                        lastChar = (Character) val;
                        break;
                    }
                }

                for (int i = nbelm; i < size; i++) {
                    if (!wadah.isEmpty() && wadah.get(0) instanceof Character) {
                        lastChar++;
                        wadah.add((T) (Character) lastChar);
                    } else {
                        wadah.add(null);
                    }
                    nbelm++;
                }
            } else if (size < nbelm) {
                for (int i = nbelm - 1; i >= size; i--) {
                    wadah.remove(i);
                }
                nbelm = size;
            }
        }
    }


    public void add(T nilai) {
        if (nbelm < wadah.size()) {
            // Simpan secara manual di slot berikutnya
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
            // Geser manual elemen dari index ke kiri
            for (int i = index; i < nbelm - 1; i++) {
                T next = wadah.get(i + 1);
                wadah.remove(i);
                wadah.add(i, next);
            }
            // kosongkan elemen terakhir
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
