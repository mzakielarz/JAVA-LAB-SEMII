public class Person {
    String name;
    String email;
    String phone_number;
    String address;
    String Date_of_Birth;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String date_of_Birth) {
        Date_of_Birth = date_of_Birth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(){
        ///////////////
    }
    public Person(String name, String email, String phone_number, String address, String date_of_Birth, String age) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        Date_of_Birth = date_of_Birth;
        this.age = age;
    }


}
