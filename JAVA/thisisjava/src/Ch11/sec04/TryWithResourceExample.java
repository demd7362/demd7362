package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")){
			String data = res.readEng();
			int value = Integer.parseInt(data);
			
		} catch (Exception e) {
			System.out.println("예외 처리 : "+e.getMessage());
		}
		
		System.out.println();
		try(MyResource res = new MyResource("A")){
			String data = res.readNum();
			int value = Integer.parseInt(data);
		} catch ( Exception e) {
			System.out.println("예외 처리 : "+e.getMessage());
		}
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try(res1; res2){
			String data1 = res1.readEng();
			String data2 = res2.readEng();
			
		} catch (Exception e) {
			System.out.println("예외 처리 : "+ e.getMessage());
		}

	} // try() 괄호안에 있는거 자동으로 닫힘

}
