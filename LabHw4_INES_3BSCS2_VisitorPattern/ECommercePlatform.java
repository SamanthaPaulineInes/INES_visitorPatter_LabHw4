package LabHw4_INES_3BSCS2_VisitorPattern;

public class ECommercePlatform
{
    public static void main(String[] args)
    {
        Furniture sideTable = new Furniture("Side Table", 550.0, 30);
        Furniture babyChair = new Furniture("Baby Chair",350.0, 20);

        Furniture officeTable = new Furniture("Office Table", 1010.0, 40);
        Furniture bigCabinet = new Furniture("Big Cabinet", 1100.0, 50);

        LightCalculator lightCalculator = new LightFurnitures();
        HeavyCalculator heavyCalculator = new HeavyFurnitures();

        System.out.print("\nLABORATORY ASSIGNMENT 4: VISITOR PATTERN | INES | 3 BSCS 2");

        System.out.print("\n\nE-COMMERCE PLATFORM");

        System.out.print("\n\nLight Weight Furnitures:\n");

        System.out.print("Customer 1: ");
        System.out.print(sideTable.getFurniture() + " price is ₱" + sideTable.getPrice() + " + Shipping Fee: ₱0.1. Total of ₱" + sideTable.accept(lightCalculator, sideTable.getPrice(), sideTable.getDistance()));
        System.out.print("\n");
        System.out.print("Customer 2: ");
        System.out.print(babyChair.getFurniture() + " price is ₱" + babyChair.getPrice() + " + Shipping Fee: ₱0.1. Total of ₱" + babyChair.accept(lightCalculator, babyChair.getPrice(), babyChair.getDistance()));

        System.out.print("\n\nHeavy Weight Furnitures:\n");

        System.out.print("Customer 1: ");
        System.out.print(officeTable.getFurniture() + " price is ₱" + officeTable.getPrice() + " + Shipping Fee: ₱0.1 and Distance Fee: ₱40. Total of ₱" + officeTable.accept(heavyCalculator, officeTable.getPrice(), officeTable.getDistance()));
        System.out.print("\n");
        System.out.print("Customer 2: ");
        System.out.print(bigCabinet.getFurniture() + " price is ₱" + bigCabinet.getPrice() + " + Shipping Fee: ₱0.1 and Distance Fee: ₱50. Total of ₱" + bigCabinet.accept(heavyCalculator, bigCabinet.getPrice(), bigCabinet.getDistance()));

        System.out.print("\n");
    }
}
