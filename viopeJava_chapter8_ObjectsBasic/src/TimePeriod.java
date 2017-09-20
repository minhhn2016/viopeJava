public class TimePeriod {
    private int hours;
    private int minutes;

    public TimePeriod() {

    }

    public void addHours(int hoursToAdd) {
        if (hoursToAdd >= 0 && hours <= 99) {
            hours += hoursToAdd;
            if (hours > 99) {
                hours = 99;
            }
        }
    }

    public void addMinutes(int minutesToAdd) {
        if (minutesToAdd >= 0 && minutes <= 59) {
            minutes += minutesToAdd;
            if (minutes >= 60) {
                hours += 1;
                minutes -= 60;
                if (hours > 99) {
                    hours = 99;
                    minutes = 60 - minutesToAdd;
                }
            }
        }
    }

    @Override
    public String toString() {
        return hours + " h " + minutes + " min";
    }
}
