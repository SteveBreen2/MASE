package week5;

import java.util.ArrayList;

public class BusDepot {
	
	private ArrayList<Bus> busArray=new ArrayList<>();
	
	public void addBus(Bus bus){
		busArray.add(bus);
	}
	
	public Bus searchForBus(String make){
		for(Bus bus:busArray){
			if(bus.getMake().equalsIgnoreCase(make)){
				return bus;
			}
		}
		return null;
	}
	
	public int getBusCount(){
		return Bus.getCount();
	}
	
	public static void main(String args[]){
		Bus b=new Bus();
		b.setDriversName("Bob");
		b.setMake("Volvo");
		b.setNumberOfSeats(50);
		BusDepot bd= new BusDepot();
		bd.addBus(b);
		System.out.println(bd.getBusCount());
		System.out.println(bd.searchForBus("Volvo"));
	}

}
