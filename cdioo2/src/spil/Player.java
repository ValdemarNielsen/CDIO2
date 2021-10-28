package spil;

public class Player {

    private final String name;
    private final Account account;

    public Player(String name) {
        this.name = name;
        this.account = new Account();
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }


}
