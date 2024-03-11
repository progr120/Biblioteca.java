package Java_Collection_Framework;

import java.util.Date;

public class Book {
    private String title;
    private boolean loaned;
    private Date loanDate;

    public Book(String title) {
        this.title = title;
        this.loaned = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
}