package domain;

public non-sealed class Salesman extends Employee {

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String name,
            String code,
            String address,
            int age,
            double salary,
            double percentPerSold,
            double soldAmount) {
        super(name, code, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    public Salesman() {
        super("", "", "", 0, 0.0);
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary() {
        // Assuming full salary is base salary plus commission
        return this.salary + (this.soldAmount * this.percentPerSold / 100);
    }
}
