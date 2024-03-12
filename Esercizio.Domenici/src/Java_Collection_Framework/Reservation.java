package Java_Collection_Framework;

class Reservation {
    private String name;
    private int startDate;
    private int endDate;

    public Reservation(String name, int startDate, int endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }
}    

