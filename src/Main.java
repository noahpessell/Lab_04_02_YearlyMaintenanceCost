//Start
//OUTPUT “What is the dollar cost of home maintenance in spring?”
//	INPUT springCost
//OUTPUT “What is the dollar cost of home maintenance in summer?”
//	INPUT summerCost
//OUTPUT “What is the dollar cost of home maintenance in fall?”
//	INPUT fallCost
//OUTPUT “What is the dollar cost of home maintenance in winter?”
//	INPUT winterCost
//	yearCost = springCost + summerCost + fallCost + winterCost
//	OUTPUT “The total cost of home maintenance for the year is ”
//+ yearCost
//Stop
public class Main
{
    public static void main(String[] args)
    {
        double springCost = 740.34;
        double summerCost = 845.32;
        double fallCost = 634.09;
        double winterCost = 949.87;
        System.out.println("What is the dollar cost of home maintenance in spring?");
        //INPUT springCost
        System.out.println("What is the dollar cost of home maintenance in summer?");
        //	INPUT summerCost
        System.out.println("What is the dollar cost of home maintenance in fall?");
        //	INPUT fallCost
        System.out.println("What is the dollar cost of home maintenance in winter?");
        //	INPUT winterCost
        double yearCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The cost for spring is $" + springCost + ". The cost for summer is $" + summerCost + ". The cost for fall is $" + fallCost + ". The cost for winter is $" + winterCost + ". Therefore, the total cost of home maintenance for the year is $" + yearCost + ".");
    }
}