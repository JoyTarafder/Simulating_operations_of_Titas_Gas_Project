
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author Joy Tarafder
 */
public class Customer {
    private String username,fullName,address,email,password,rePassword;
    private LocalDate dob;
    private int phoneNo;

    public Customer(String username, String fullName, String address, String email, String password, String rePassword, LocalDate dob, int phoneNo) {
        this.username = username;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.rePassword = rePassword;
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

    public String getPassword() {
        return password;
    }

    public String getRePassword() {
        return rePassword;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + ", fullName=" + fullName + ", address=" + address + ", email=" + email + ", password=" + password + ", rePassword=" + rePassword + ", dob=" + dob + ", phoneNo=" + phoneNo + '}';
    }

}