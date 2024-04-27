package LabHw4_INES_3BSCS2_VisitorPattern;
import java.util.HashMap;
import java.util.Map;
public class LightFurnitures implements LightCalculator
{
    private static final Map<String, Double> lightMap = new HashMap<>();

    static
    {
        lightMap.put("Side Table", 0.1);
        lightMap.put("Baby Chair", 0.1);
    }
    @Override
    public double totalLightWeight(String furniture, double money, double distance)
    {
        double rate = lightMap.getOrDefault(furniture, 0.0);
        return money + (rate * money);
    }
}
