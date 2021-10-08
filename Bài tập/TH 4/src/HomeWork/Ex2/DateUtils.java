package HomeWork.Ex2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static int compareDate(String a, String b) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = null;
        Date date2 = null;

        try {
            date1 = dateFormat.parse(a);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            date2 = dateFormat.parse(b);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        assert date1 != null;
        assert date2 != null;
        if (date1.compareTo(date2) > 0) {
            return 1;
        } else if (date1.compareTo(date2) < 0) {
            return -1;
        }
        return 0;
    }

    public static void sortingDate(String[] date) {
        for (int i = 0; i < date.length - 1; i++) {
            for (int j = i + 1; j < date.length; j++) {
                if (compareDate(date[i], date[j]) == 1) {
                    String tmp = date[i];
                    date[i] = date[j];
                    date[j] = tmp;
                }
            }
        }
    }
}
