public class Bread extends ProductForSale{
    private String flourType;
    private String color;
    public Bread(String type, int price, String description,String flourType,String color) {
        super(type, price, description);
        this.color=color;
        this.flourType=flourType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flourType='" + flourType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
