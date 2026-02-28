package _01_random._6_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;

public class LotteryTicket {
		public static void main(String[] args) {
			
			int number = 0;
			int number1 = 0;
			int number2 = 0;
			int number3 = 0;
			int number4 = 0;
			int number5 = 0;
			
			Random ran = new Random();
			
				number = ran.nextInt(100);
				System.out.println(number);
			
					number1 = ran.nextInt(100);
					System.out.println(number1);
					
					number2 = ran.nextInt(100);
					System.out.println(number2);
					
					number3 = ran.nextInt(100);
					System.out.println(number3);
					
					number4 = ran.nextInt(100);
					System.out.println(number4);
					
					number5 = ran.nextInt(100);
					System.out.println(number5);
					
					
					

			
		}
		
	}
