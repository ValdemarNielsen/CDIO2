package spil;

public class Player {

    private String name;
    private Account account;

    public Player(String name){
        this.name = name;
        Account account = new Account();
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

}
