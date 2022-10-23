

public class Student extends Person{

     int status;
     public static final int FRESHMAN = 1;
     public static final int SOPHOMORE = 2;
     public static final int JUNIOR = 3;
     public static final int SENIOR = 4;

     public Student(String name, String address, String phone, String email, int status){
          this.name = name;
          this.address = address;
          this.phone = phone;
          this.email = email;
          this.status = status;

     }




     public int getStatus() {
          return status;
     }

     public void setStatus(int status) {
          this.status = status;
     }

     @Override
     public String toString() {
          return super.toString() + "\nStatus: " + getStatus();
     }


}
