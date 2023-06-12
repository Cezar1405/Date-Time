import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        //Usando LocaleDate u otra clase de fecha, calcule e imprima:
        //cuantos dias faltan para fin de mes
        //Cuántos días quedan hasta el final del año, usando el método length() de java.time.Year.of()
        LocalDate hoy = LocalDate.now();
        Year year = Year.now();
        int toTalDias = year.length();
        int diasDelAgno = hoy.getDayOfYear();

        LocalDate finDeMes = hoy.with(TemporalAdjusters.lastDayOfMonth());
        int diasfaltantesParaMes = hoy.until(finDeMes).getDays();
        int diasRestantesAgno = toTalDias - diasDelAgno;


        System.out.println("faltan " + diasfaltantesParaMes + " dias para fin de mes y "
                + diasRestantesAgno + " dias para terminar el Año " + year);
    }
}