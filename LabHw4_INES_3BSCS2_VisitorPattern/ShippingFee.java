package LabHw4_INES_3BSCS2_VisitorPattern;

public interface ShippingFee
{
    public double accept(LightCalculator lightCalculator, double money, double distance);
    public double accept(HeavyCalculator heavyCalculator, double money, double distance);
}
