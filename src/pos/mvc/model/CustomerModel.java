/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;
/**
 *
 * @author DELL
 */
public class CustomerModel {
    private String CustID;
    private String title;
    private String name;
    private String dob;
    private String address;
    private String city;
    private double salary;
    private String zip;
    private String province;
    
    

    public CustomerModel() {
    }

    public CustomerModel(String CustID, String title, String name, String dob, double salary, String city, String address, String zip, String province) {
        this.CustID = CustID;
        this.title = title;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.province = province;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the address
     */
   public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the salary
     */
     public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "CustID=" + CustID + ", title=" + title + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", city=" + city + ", address=" + address + ", zip=" + zip + ", province=" + province + '}';
    }
    
                                                                                                                                                                                 
}
