package lottoGenerator;
import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		
		int[] numbers = new int[6];
		
		Random generator = new Random();
		
	//	generator.setSeed(System.currentTimeMillis());
		for( int i = 0; i< numbers.length; i++) 
		numbers[i] = generator.nextInt(50 +1);
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	
	}
}
