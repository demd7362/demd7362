package ch18.practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/user/Desktop/lab/VSCode/Java/thisisjava/thisisjava/thisisjavaSecondEdition/src/ch02/sec01/VariableExample.java";

		BufferedReader br = new BufferedReader(new FileReader(filePath));

		int rowNumber = 0;
		String rowData;
		while (true) {
			rowNumber++;
			rowData = br.readLine();
			if (rowData == null)
				break;
			System.out.println(rowNumber + ": " + rowData);
		}

	}

}
