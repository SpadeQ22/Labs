public class account {
    public int balance = 0;

    public void increase_balance(int amnt){
        if(amnt < 0) return;
        balance += amnt;
    }
    public void decrease_balance(int amnt) {
        if(amnt < 0 || amnt > balance) return;
        balance -= amnt;
    }
}
