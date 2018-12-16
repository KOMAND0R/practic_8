public final class Drink implements Alcoholable {
    private double alcoholVol;
    private DrinkTypeEnum type;
    public DrinkTypeEnum getType() {
        return type;
    }
    public boolean isAlcoholicDrink() {
        return false;
    }
    public double getAlcoholVol() {
        return 0;
    }
}
