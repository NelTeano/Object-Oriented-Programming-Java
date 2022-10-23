


public class Staff extends Employee{

    String title;

    // PUT JUST TO PREVENT ERRORS
    public Staff(String name, String address, String phone, String email, int officeNo, double salary, String title) {
        super(name, address, phone, email, officeNo, salary );
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }




}
