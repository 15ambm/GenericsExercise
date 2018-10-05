import java.util.ArrayList;

import java.util.Date;



public class Main {

	public static void main(String[] args) {
	
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random()*100);
		}
	 
		ArrayList<Integer> intArray = new ArrayList<>(5);
		
		for (int val: array) {
			intArray.add(val);
		}
	
		System.out.println(intArray);
		
		ArrayList<Integer> revIntArray = new ArrayList<>(5);
		
		for (int val: intArray) {
			revIntArray.add(0,val);
		}
		
//		for(int i = intArray.size() - 1; i >= 0; i--) {
//			revIntArray.add(intArray.get(i));
//		}
		
		System.out.println(revIntArray);
		
		ArrayList<HourlyEmployee> HE = new ArrayList<>(100);
		
		HE.add(new HourlyEmployee("Doug",new Date(), 1, 1));
		HE.add(new HourlyEmployee("James",new Date(), 2, 2));
		HE.add(new HourlyEmployee("Ted",new Date(), 3, 3));
		HE.add(new HourlyEmployee("Cache",new Date(), 3, 3));
		
		System.out.println(HE);
		System.out.println(HE.size());
		
		HourlyEmployee Steve = new HourlyEmployee("Steve",new Date(), 4, 4);
		
		HE.add(0,Steve);
		
		System.out.println(HE);
		
		HE.remove(2);
		HE.trimToSize();
		
		System.out.println(HE + "\n" + HE.size() + "\n\n");
		
		
		//---------------------------Next Part--------------------------------------
		
		Pair couple1 = new Pair("John","Jane");
		Pair couple2 = new Pair("Brad","Brenda");
		Pair couple3 = new Pair("Brad","Brenda");
		
		
		System.out.println(couple2.equals(couple3));
		
		Triple place1 = new Triple("Toronto", 3, "Montreal");
		Triple place2 = new Triple("Toronto", 3, "Montreal");
		Triple place3 = new Triple("New York", 5, "Boston");
		
		System.out.println(place1.equals(place2));
		
		
		
		
		
		
		
	}
}
