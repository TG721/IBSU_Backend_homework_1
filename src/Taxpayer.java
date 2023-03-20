public class Taxpayer {
    String securityNumber;
    Double yearlyGrossIncome;

    public Double getTaxOwned() {
        return taxOwned;
    }

    Double taxOwned;

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public Double getYearlyGrossIncome() {
        return yearlyGrossIncome;
    }

    public void setYearlyGrossIncome(Double yearlyGrossIncome) {
        this.yearlyGrossIncome = yearlyGrossIncome;
        calculateTax();
    }

    private void calculateTax(){
        if(this.yearlyGrossIncome<30000) this.taxOwned = this.yearlyGrossIncome * 0.15;
        else this.taxOwned = this.yearlyGrossIncome * 0.28;
    }
}
