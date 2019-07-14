public class BicycleRegistration{
	
	public static void main(String args[]){
		
		Bicycle bike1, bike2;
		String owner1, owner2;
		String tagNo1, tagNo2;
		// change-01
		bike1 = new Bicycle();
		bike1.setOwnerName ("Ruwan");
		bike1.setTagNo("234RR");
		
		bike2 = new Bicycle();
		bike2.setOwnerName ("Kalpage");
		bike2.setTagNo("2016TT");
		// Change-02
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		tagNo1 = bike1.getTagNo();
		tagNo2 = bike2.getTagNo();
		// Change-01
		System.out.println(owner1 + " owns a bike1.");
		System.out.println(owner2 + " owns a bike2.");
		System.out.println("bike1 tag number is "+tagNo1);
		System.out.println("bike2 tag number is "+tagNo2);
	}
}
		