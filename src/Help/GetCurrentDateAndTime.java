package Help;

import java.util.Date;

public class GetCurrentDateAndTime {

    public GetCurrentDateAndTime() {

        Date date = new Date();

        System.out.println(date.getDate() + "/"
                + (date.getMonth() + 1) + "/"
                + (date.getYear() - 100));

        System.out.println(date.toString());

        System.out.println(date.getHours() + ":"
                + date.getMinutes() + ":"
                + date.getSeconds());
    }
}
