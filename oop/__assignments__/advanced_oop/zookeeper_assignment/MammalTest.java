package oop.__assignments__.advanced_oop.zookeeper_assignment;

public class MammalTest {
    public static void main(String[] args) {
        Gorilla Harambe = new Gorilla();
        System.out.println("\nHarambe's Energy Level: " + Harambe.getEnergyLevel());

        Harambe.throwSomething();
        Harambe.throwSomething();
        Harambe.throwSomething(); //energy level should be 85

        Harambe.eatBananas();
        Harambe.eatBananas(); //energy level should be 105

        Harambe.climbTrees(); //energy level should be 95

        System.out.println("\n-------------MegaBat Enters!!!-------------\n");
        BigBat MegaBat = new BigBat();
        System.out.println("\nMegaBat's Energy Level: " + MegaBat.getEnergyLevel()); //energy level should be 300
        
        MegaBat.attackTown();
        MegaBat.attackTown();
        MegaBat.attackTown(); //energy level should be 0 (decreased by 100 each time)

        MegaBat.eatHumans();
        MegaBat.eatHumans(); //energy level should be 50

        MegaBat.fly();
        MegaBat.fly(); //energy level should be 0 (decreased by 25 each time)
        System.out.println("\nMegabat's Remaining Energy Level: " + MegaBat.getEnergyLevel());



    }
    
}
