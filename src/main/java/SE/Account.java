package SE;

public class Account {
    private float money;
    private float balance;

    public Account (float money){
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    public float getBalance() {
        return balance;
    }

    public float income(float money){
        if (money <= 0){
            throw new IllegalArgumentException(" > 0");
        }
        else {
            balance = balance + money;
            return balance;
        }
    }

    public float expense(float money){
        balance = balance - money;
        return money;
    }
}
