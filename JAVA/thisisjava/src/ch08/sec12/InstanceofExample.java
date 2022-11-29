package ch08.sec12;

public class InstanceofExample {

	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		} 
		vehicle.run();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi); // 정적 메소드에서 구현해서 실행 객체를 바로 가져왔다
		System.out.println();
		ride(bus);
	}

}
