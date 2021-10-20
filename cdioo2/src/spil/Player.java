package spil;

public class Player {

    private String name;
    private Account account;

    public Player(String name, Account account){
        this.name =name;
        this.account =account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

}
