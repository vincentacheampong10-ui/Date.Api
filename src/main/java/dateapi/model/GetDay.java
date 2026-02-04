package dateapi.model;

public class GetDay {
    public String date;
    public int dayOfMonth;
    public String status;

    public GetDay(String date, int dayOfMonth, String status) {
        this.date = date;
        this.dayOfMonth = dayOfMonth;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public String getStatus() {
        return status;
    }
}
