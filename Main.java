
public class Main {

	public static void main(String args[]) {
		System.out.println(ways(5));

	}

	/**
	 * 
	 * @param n
	 * n the number of balls in the bag 
	 * 
	 * @return result
	 * result is the number of how many way you
	 * can remove the balls from the bag by selecting 
	 * one ball or two balls in time
	 * 
	 */
	static int ways(int n) {
		//base cases
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else {
			int oneBall = 1;
			int twoBall = 2;
			int result = 0;
			for (int i = 3; i <= n; i++) {
				result = oneBall + twoBall;
				oneBall = oneBall + twoBall;
				twoBall = oneBall - twoBall;
				oneBall = oneBall - twoBall;
				twoBall = result;
			}
			return result;
		}
	}
}
