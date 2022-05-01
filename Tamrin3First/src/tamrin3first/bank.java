/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamrin3first;

/**
 *
 * @author m
 */
public class bank {

    private String AccountNumber;// shomare hesab
    private String AccountName; // asm hesab
    private long inventory;// mojodi

    public bank() {
        AccountNumber = "0";
        AccountName = "NO NAME";
        inventory = 0;
    }

    public bank(String AccountNumber, String AccountName, long inventory) {
        if (AccountNumber.trim().length() < 3) {
            this.AccountNumber = "eror";
        } else {
            this.AccountNumber = AccountNumber;
        }
        if (AccountName.trim().length() < 3) {
            this.AccountName = "nothing";
        } else {
            this.AccountName = AccountName;
        }
        if (inventory < 0) {
            this.inventory = 0;
        } else {
            this.inventory = inventory;
        }

    }

    public bank(bank b) {
        this.AccountNumber = b.AccountNumber;
        this.AccountName = b.AccountName;
        this.inventory = b.inventory;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountNumber() {
        return this.AccountNumber;
    }
    public void setAccountName(String AccountName){
        this.AccountName = AccountName;
    }
    public String getAccountName(){
        return this.AccountName;
    }
    public void setinventory(long inventory){
        this.inventory = inventory;
    }
    public long getinventory (){
    return this.inventory;
    }
    public String toString(){
        return "{" + "AccountNumber : " + AccountNumber+
                "     AccountName : " + AccountName+
                "     inventory : "+inventory + "}";
    }
    public boolean equals(bank b){
        return (AccountNumber == b.AccountNumber && AccountName == b.AccountName && inventory == b.inventory);
    }

    public void add(int a){
        if (a >= 0) {
            this.inventory += a;
        }
        else{
            this.inventory += 0;
        }
    }
    public String withdraw(int a){
        if (a >= 0 && a <= inventory) {
            this.inventory -= a;
        }
        if(a < 0){
            return ("noooooooooooooo");
        }
        
        return "inventory is : "+this.inventory;
    }
    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}
