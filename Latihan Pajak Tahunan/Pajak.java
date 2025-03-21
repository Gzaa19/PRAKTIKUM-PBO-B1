import java.text.NumberFormat;
import java.util.Locale;

public interface Pajak {
    default String formatRupiah(double amount) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(amount);
    }
    String hitungPajak();
}
