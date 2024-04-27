package LabHw4_INES_3BSCS2_VisitorPattern;
import java.util.HashMap;
import java.util.Map;
public class HeavyFurnitures implements HeavyCalculator
{
    private static final Map<String, Double> heavyMap = new HashMap<>();

    static
    {
        heavyMap.put("Office Table", 0.1);
        heavyMap.put("Big Cabinet", 0.1);
    }
    @Override
    public double totalHeavyWeight(String furniture, double money, double distance)
    {
        double rate = heavyMap.getOrDefault(furniture, 0.0);
        double dFee = distance * 1;
        return dFee + (rate * money) + money;
    }
}
