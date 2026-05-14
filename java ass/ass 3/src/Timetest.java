class Time {

    int hr, min, sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    // Add two Time objects      
    void add(Time t) {

        int h = hr + t.hr;
        int m = min + t.min;
        int s = sec + t.sec;

        // Carry forward
        m = m + s / 60;
        s = s % 60;

        h = h + m / 60;
        m = m % 60;

        h = h % 24;

        System.out.println("Time Addition: " + h + ":" + m + ":" + s);
    }

    // Add hours
    void add(int h) {

        int newHr = (hr + h) % 24;

        System.out.println("After Adding Hours: "
                + newHr + ":" + min + ":" + sec);
    }

    // Add minutes
    void add(int m, boolean minute) {

        int totalMin = min + m;
        int newHr = hr + totalMin / 60;
        int newMin = totalMin % 60;

        newHr = newHr % 24;

        System.out.println("After Adding Minutes: "
                + newHr + ":" + newMin + ":" + sec);
    }

    // Add seconds
    void add(int s, char second) {

        int totalSec = sec + s;
        int newMin = min + totalSec / 60;
        int newSec = totalSec % 60;

        int newHr = hr + newMin / 60;
        newMin = newMin % 60;

        newHr = newHr % 24;

        System.out.println("After Adding Seconds: "
                + newHr + ":" + newMin + ":" + newSec);
    }
}

public class Timetest{

    public static void main(String[] args) {

        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 20, 30);

        // Add two Time objects
        t1.add(t2);

        // Add hours
        t1.add(5);

        // Add minutes
        t1.add(30, true);

        // Add seconds
        t1.add(40, 's');
    }
}