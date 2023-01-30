public class Marathon
{
	
	public static int findFastest(int[] times)
	{
		int fastestTime = times[0];
		int indexOfFastest = 0;
		int counter = 1;
		int time = 0;
		
		while(counter < times.length)
		{
			time = times[counter];
			
			if(time < fastestTime)
			{
				fastestTime = time;
				indexOfFastest = counter;
			}
			
			counter += 1;
		}
		
		return indexOfFastest;
	}
	
	
		public static int findSecondFastest(int[] times)
		{
			int indexOfSecondFastest = 0;
			int secondFastestTime = times[0];
			int indexOfFastest = findFastest(times);
			
			int counter = 1;
			int time = 0;
			
			while(counter < times.length)
			{	
				if(counter == indexOfFastest)
				{
					counter += 1;
					continue;
				}
				
				time = times[counter];
				
				if(time < secondFastestTime)
				{
					secondFastestTime = time;
					indexOfSecondFastest = counter;
				}
		
				counter += 1;
			}
			
			return indexOfSecondFastest;
		}

	public static void main(String[] args)
	{
		String[] names = 
		{
			"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
	        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
	        "Aaron", "Kate"
	    };
		
		int[] times = 
		{
	        341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
	        343, 317, 265
		};
		
		int indexOfFastest = findFastest(times);
		
		System.out.println("The fastest person was " + names[indexOfFastest] + " with a time of " + times[indexOfFastest] + " minutes.");
		
		int indexOfSecondFastest = findSecondFastest(times);
		
		System.out.println("The second fastest person was " + names[indexOfSecondFastest] + " with a time of " + times[indexOfSecondFastest] + " minutes.");
	}
}