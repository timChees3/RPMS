public class User
{
    // Instance Variables:
    private static int userID = 0;
    private String fName;
    private String lName;
    private String email;
    private String phoneNumber;
    private char gender;
    private int age;
    private String address;


    // Constructor:
    public User(String fName, String lName, String email, String phoneNumber, char gender, int age, String address)
    {
        this.userID += 1;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }


    // Getter and Setter for fName:
    public String getFName()
    {
        return fName;
    }

    public void setFName(String fName)
    {
        this.fName = fName;
    }

    // Getter and Setter for lName:
    public String getLName()
    {
        return lName;
    }

    public void setLName(String lName)
    {
        this.lName = lName;
    }

    // Getter and Setter for email:
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    // Getter and Setter for phoneNumber:
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for gender:
    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    // Getter and Setter for age:
    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter and Setter for address:
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    // toString() Method:

    @Override
    public String toString() {
        return "User:\n" +
                "User ID: " + userID +
                "\nFirst Name: " + fName +
                "\nLast Name: " + lName +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNumber+
                "\nGender: " + gender +
                "\nAge: " + age +
                "\nAddress: " + address;
    }
}
