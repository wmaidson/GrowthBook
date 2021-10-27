import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        String lang = locale.getDisplayLanguage();
        String country = locale.getDisplayCountry();

        System.out.println(locale);
        System.out.println(lang);
        System.out.println(country);

    }
}
