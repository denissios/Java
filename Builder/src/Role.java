public enum Role {
    STAFF(0.1),
    MANAGER(0.2),
    EXECUTIVE(0.3);

    private double percents;

    Role(double percents)
    {
        this.percents = percents;
    }

    public void upPercents() { this.percents += 0.1; }
    public double getPercents() { return this.percents; }
}
