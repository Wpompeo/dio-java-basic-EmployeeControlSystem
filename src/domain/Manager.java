package domain;

public non-sealed class Manager extends Employee {

    private String login;
    private String password;
    private double commision;

    @Override
    public String getCode() {
        return "MG" + this.code;
    }

    public Manager(String name,
            String code,
            String address,
            int age,
            double salary,
            String login,
            String password,
            double commision) {
        super(name, code, address, age, salary);
        this.login = login;
        this.password = password;
        this.commision = commision;
    }

    public Manager() {
        super("", "", "", 0, 0.0);
        this.login = "";
        this.password = "";
        this.commision = 0.0;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.commision;
    }

}
