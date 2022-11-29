package ch03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		int value = 772;
		
		//우측으로 3byte(24bit)이동하고 끝 1바이트만 읽음 [00000000]
		byte byte1 = (byte)(value>>>24);
		int int1 = byte1 & 255; // c프로그램이 보낸 값으로 변환 
		System.out.println("첫번째 바이트 부호 없는 값: "+int1);

		//우측으로 2byte(16bit)이동하고 끝 1바이트만 읽음 [00000000]	
		byte byte2 = (byte)(value>>>16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두번째 바이트 부호 없는 값: "+int2);
		
		//우측으로 1byte(8bit)이동하고 끝 1바이트만 읽음 [00000011]
		byte byte3 = (byte)(value>>>8);
		int int3 = byte3 & 255;
		System.out.println("세번째 바이트 부호 없는 값: "+int3);
		
		//이동하지 않고 끝 1바이트만 읽음 [00000100]
		byte byte4 = (byte)value;
		int int4 = byte4 & 255;
		System.out.println("네번째 바이트 부호 없는 값: "+int4);
		
	}

}
