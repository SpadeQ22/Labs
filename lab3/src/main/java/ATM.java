public class ATM {
    account acc = new account();
    public void deposit_amnt(int amnt){
        acc.increase_balance(amnt);
    }
    public void withdraw(int amnt){
        acc.decrease_balance(amnt);
    }
}
