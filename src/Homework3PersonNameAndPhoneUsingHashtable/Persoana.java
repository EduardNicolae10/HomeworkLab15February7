package Homework3PersonNameAndPhoneUsingHashtable;

public class Persoana {
    private String phone1;
    private String phone2;

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Override
    public String toString() {
        return " " +
                "phone1: '" + phone1 + '\'' +
                " , phone2: '" + phone2 + '\'' +
                ' ';
    }

    public Persoana(String phone1, String phone2) {
        this.phone1 = phone1;
        this.phone2 = phone2;
    }
}
