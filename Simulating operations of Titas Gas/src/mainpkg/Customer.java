
package mainpkg;

/**
 *
 * @author Joy Tarafder
 */
public class Customer {
    private String username,fullName,address,email,password;
    private int phoneNo;

    public Customer(String username, String fullName, String address, String email, String password, int phoneNo) {
        this.username = username;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.password = password;
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

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + ", fullName=" + fullName + ", address=" + address + ", email=" + email + ", password=" + password + ", phoneNo=" + phoneNo + '}';
    }
    
    
}
