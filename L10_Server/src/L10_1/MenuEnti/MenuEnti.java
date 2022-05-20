package L10_1.MenuEnti;

import java.io.Serializable;
import java.util.List;

public class MenuEnti implements Serializable {
    private String food1;
    private String food2;
    private int price1;
    private int price;

    public String getFood1() {
        return food1;
    }

    public void setFood1(String food1) {
        this.food1 = food1;
    }

    public String getFood2() {
        return food2;
    }

    public void setFood2(String food2) {
        this.food2 = food2;
    }

    public int getPrice1() {
        return price1;
    }

    public void setPrice1(int price1) {
        this.price1 = price1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getChose() {
        return chose;
    }

    public void setChose(String chose) {
        this.chose = chose;
    }

    private String chose;
    public MenuEnti(){};
    public MenuEnti(String food1 ,int price1)
    {
        this.food1=food1;
        this.price=price1;
    }
}
