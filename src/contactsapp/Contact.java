package contactsapp;
public class Contact {
    private String name;
    private long number;
    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public long getNumber() {
        return number;
    }
}