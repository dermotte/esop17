package at.aau.itec.esop17.lesson06;

class Time {
    int h, m, s;

    public void set(int sec) {
        h = sec / 3600;
        m = (sec % 3600) / 60;
        s = sec % 60;
    }

    public String toString() {
        return h + ":" + m + ":" + s;
    }
}

class TimeProgram {
    /**
     * Converts seconds into set of hours, minutes and seconds
     * @param sec
     * @return
     */
    static Time convert (int sec) {
        Time t = new Time();
        t.h = sec / 3600; t.m = (sec % 3600) / 60; t.s = sec % 60;
        return t;
    }

    public static void main (String[] arg) {
        Time t = convert(10000);
        System.out.println(t.toString());
        Time u = new Time();
        u.set(10000);
        System.out.println(u.toString());
    }
}
