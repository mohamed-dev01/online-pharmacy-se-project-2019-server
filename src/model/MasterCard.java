/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */
public class MasterCard implements PayStrategy{

    int creditCardNo,expiryDate;

    public MasterCard(int creditCardNo, int expiryDate) {
        this.creditCardNo = creditCardNo;
        this.expiryDate = expiryDate;
    }

    public void setCreditCardNo(int creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCreditCardNo() {
        return creditCardNo;
    }

    public int getExpiryDate() {
        return expiryDate;
    }
    
    @Override
    public void payinvoice() {
       
    }
    
}
