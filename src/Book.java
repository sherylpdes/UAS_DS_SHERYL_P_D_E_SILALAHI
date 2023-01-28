import java.util.Objects;

public class Book {
    private String firstName;
    private int kelas;
    private int page;

    public Book(String firstName, int kelas, int page) {
        this.firstName = firstName;
        this.kelas = kelas;
        this.page = page;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPage() == book.getPage() &&  getKelas() == book.getKelas() && getFirstName().equals(book.getFirstName()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getKelas(), getPage());
    }

    @Override
    public String toString() {
        return "Book{" +
                "firstName='" + firstName + '\'' +
                ", class='" + kelas + '\'' +
                ", page=" + page +
                '}';
    }
}


