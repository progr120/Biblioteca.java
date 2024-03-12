package Java_Collection_Framework;

import java.time.LocalDateTime;

public class Book {

    private String title;
    private LocalDateTime loanDate;

    public Book(String title) {
        this.title = title;
    }

    public boolean isLoan() {
        return loanDate != null;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", loanDate=" + loanDate + "]";
    }



}