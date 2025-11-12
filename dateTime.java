import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateTime {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println(cal.getTime());
    }
}
