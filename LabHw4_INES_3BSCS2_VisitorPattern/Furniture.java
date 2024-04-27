package LabHw4_INES_3BSCS2_VisitorPattern;

public class Furniture implements ShippingFee
{
    @Override
    public double accept(LightCalculator lightCalculator, double money, double distance)
    {
        this.price = money;
        return lightCalculator.totalLightWeight(furniture, money, distance);
    }
    @Override
    public double accept(HeavyCalculator heavyCalculator, double money, double distance)
    {
        this.price = money;
        return heavyCalculator.totalHeavyWeight(furniture, money, distance);
    }

    private String furniture;
    private double price;
    private double distance;

    public Furniture(String furniture, double money, double distance)
    {
        this.furniture = furniture;
        this.price = money;
        this.distance = distance;
    }

    public void setFurniture(String furniture)
    {
        this.furniture = furniture;
    }
    public String getFurniture()
    {
        return furniture;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }
    public double getDistance()
    {
        return distance;
    }
}
