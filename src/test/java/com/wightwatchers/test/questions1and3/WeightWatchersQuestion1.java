package com.wightwatchers.test.questions1and3;

import java.io.*;

import org.testng.annotations.Test;

public class WeightWatchersQuestion1 {
	static String filePath = "./src/test/java/com/wightwatchers/test/questions1and3/dictionary.txt"; //File path from root

	@Test
	public void disctionaryTest() throws FileNotFoundException {

		try {
			if (!doesFileExist(filePath)) {//check if file path exists
				throw new FileNotFoundException("File does not exist!");
			} else {
				System.out.println("File exists! Print out the Words and Meaning!");
				BufferedReader reader = new BufferedReader(new FileReader(filePath));//read file line by line
				String currentLine = null;
				while ((currentLine = reader.readLine()) != null) {
						int i = 1;
						String[] splitLine = currentLine.split("-");//split word
						String[] meaning = splitLine[i].split(",");//split meaning
						System.out.println("Word" + i + ": " + splitLine[0].trim());//print word
						i++;
						for (int j = 0; j < meaning.length; j++) {
							System.out.println("Meaning" + (j + 1) + ": " + meaning[j].trim());//print meaning
						}
					}
					reader.close();//close file
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static boolean doesFileExist(String path) {//doesFileExist class
		File file = new File(path);

		if (!file.exists() || !file.isFile()) {
			return false;
		} else {
			return true;
		}
	}
}
