package L10_Tamrinclass.BankEnti;

import java.io.Serializable;

public class BankEnti implements Serializable {
    private String idCard;
    private String name;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;
    public BankEnti(){};
    public BankEnti(String idCard,String name,int money)
    {
        this.money=money;
        this.idCard=idCard;
        this.name=name;
    }
}
