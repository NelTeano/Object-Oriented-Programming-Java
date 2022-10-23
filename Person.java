



public class Person {

    String name = "unknown";
    String address = "unknown";
    String phone = "unknown";
    String email = "unknown";

    public Person(){
        this.name = "";
        this.address = "";
        this.phone = "";
        this.email = "";
    }

    public Person(String name, String address, String phone_number, String email_address){
        this.name = name;
        this.address = address;
        this.phone = phone_number;
        this.email = email_address;

    }


    // GETTER AND SETTER OF ALL DATA FIELDS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone_number() {
        return phone;
    }

    public void setPhone_number(String phone_number) {
        this.phone = phone_number;
    }


    public String getEmail_address() {
        return email;
    }

    public void setEmail_address(String email_address) {
        this.email = email_address;
    }





    // TO STRING METHOD


    @Override
    public String toString() {
        return "\nName: " + name + "\nAddress : " + address + "\nPhone Number : " + phone + "\nEmail Address : "+ email;
    }



}
