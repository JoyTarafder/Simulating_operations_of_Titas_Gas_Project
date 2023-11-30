
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Joy Tarafder
 */
public class Customer implements Serializable{
    private String username,fullName,address,email,gender,password;
    private LocalDate dob;
    private int phoneNo;

    public Customer(String username, String fullName, String address, String email, String gender, String password, LocalDate dob, int phoneNo) {
        this.username = username;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.dob = dob;
        this.phoneNo = phoneNo;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + ", fullName=" + fullName + ", address=" + address + ", email=" + email + ", gender=" + gender + ", password=" + password + ", dob=" + dob + ", phoneNo=" + phoneNo + '}';
    }

    
}