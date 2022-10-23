


public class Employee extends Person{

    int officeNo;
    double salary;

    public  Employee(String name, String address, String phone, String email, int officeNo, double salary){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.officeNo = officeNo;
        this.salary = salary;

    }

    public int getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(int officeNo) {
        this.officeNo = officeNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() + "\nOffice No: " + officeNo + "\nSalary: $" + getSalary();
    }
}
