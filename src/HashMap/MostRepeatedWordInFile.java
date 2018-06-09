package HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedWordInFile {

	public static void main(String[] args) {
		
		String filepath = "/Users/saikiran/Desktop/reader.txt";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(filepath));

			//Reading the first line into currentLine
			String CurrentLine = reader.readLine();

			while(CurrentLine != null) {

				//splitting the currentLine into words
				String[] words = CurrentLine.toLowerCase().split(" ");
				for(String word : words) {
					if(map.containsKey(word)) {
						map.put(word, map.get(word)+1);
					}
					else {
						map.put(word, 1);
					}

					//Reading next line into currentLine
					CurrentLine = reader.readLine();
				}
			}

			String mostRepeatedWord = null;
			int count =0;

			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for(Entry<String, Integer> entry : entrySet) {
				if(entry.getValue() > count) {
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}

			}
			System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
			System.out.println("Number Of Occurrences : "+count);

		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();   //Closing the reader
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
