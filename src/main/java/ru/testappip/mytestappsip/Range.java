package ru.testappip.mytestappsip;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Range {

	public static void main(String[] args) {

		String strOne;
		String strTwo;
		ArrayList<String> rangeResult = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		strOne = in.nextLine();
		strTwo = in.nextLine();

		rangeResult = Range(strOne, strTwo);

		for(String range : rangeResult){

			System.out.println(range);
		}
	}

	public static ArrayList<String> Range(String strOne, String strTwo) {
		// TODO Auto-generated method stub

		String arrOne[] = strOne.split(Pattern.quote("."));
		String arrTwo[] = strTwo.split(Pattern.quote("."));
		
		long l;
		long resultOne = 0;
		long resultTwo = 0;
		
		for (int i = 0; i < arrOne.length; i++) {
			
			l = Long.parseLong(arrOne[i]);
			resultOne <<= 8;
			resultOne|= l & 0xff;
			
			l = Long.parseLong(arrTwo[i]);
			resultTwo <<= 8;
			resultTwo |= l & 0xff;
			
		}
		
		ArrayList<String> arrResult = new ArrayList<String>();
		String ipBin;
		long a = 1;
		
			for (int i=0; i<resultTwo-resultOne-1; i++) {
				
				l = resultOne + a;
				ipBin = Long.toString(l, 2);
				arrResult.add(ipBin);
				a++;
				
			}
			
			String ipResult;
			long ipResultl;

			ArrayList<String> rangeResult = new ArrayList<>();

			for (String strings : arrResult){
				
				int c = 0;
				String ipResults = "";
				while (c<strings.length()){
				ipResult = strings.substring(c, c+8);
				ipResultl = Long.parseLong(ipResult, 2);
				ipResults += Long.toString(ipResultl);

				if (c != 24){
					ipResults += ".";
	                
	            } 
				
	            c = c + 8;
	            
				}
				rangeResult.add(ipResults);

			}

			return rangeResult;
		
	}

}
