/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author DELL
 */
public class ItemModel {
     private String ItemCode; 
     private String Description;                 
     private String PackSize  ;
     private Double UnitPrice; 
     private Integer qoh;

    public ItemModel() {
    }

    public ItemModel(String ItemCode, String Description, String PackSize, Double UnitPrice, Integer qoh) {
        this.ItemCode = ItemCode;
        this.Description = Description;
        this.PackSize = PackSize;
        this.UnitPrice = UnitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the PackSize
     */
    public String getPackSize() {
        return PackSize;
    }

    /**
     * @param PackSize the PackSize to set
     */
    public void setPackSize(String PackSize) {
        this.PackSize = PackSize;
    }

    /**
     * @return the UnitPrice
     */
    public Double getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemModel{" + "ItemCode=" + ItemCode + ", Description=" + Description + ", PackSize=" + PackSize + ", UnitPrice=" + UnitPrice + ", qoh=" + qoh + '}';
    }
     
     
}
