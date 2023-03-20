public class Pizza {
    private String toppings;
    private Integer diameter;
    private Double price;

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings='" + toppings + '\'' +
                ", diameter=" + diameter +
                ", price=" + price +
                '}';
    }
}
