package service;


public class PersonalityCalculator
{
	public String findYourBrainType(String input)
	{
		System.out.println(input);
		int x = findAnswers(input);
		String str ="";
	      if(x>=20 && x <= 55)
	    	  str = "leftbrained";
	      if(x>=56 && x <=64)
	    	  str = "No clear preference";
	      if(x>=65 && x<=100)
	    	  str = "rightbrained";
	      System.out.println(str);
		return str;
	}
	public int findAnswers(String input)
	{
		 String[] values = input.split(",");
	     int size = values.length;
	     System.out.println(size);
	      int [] array = new int [size];
	      for(int i=0; i<size; i++) {
	         array[i] = Integer.parseInt(values[i]);
	         System.out.println(array[i]);
	      }
	      int a = (array[0]+array[1]+array[2]+array[4]+array[7]+array[9]+array[10]+array[11]+array[13]+array[17]+array[19]);
	      System.out.println(a);
	      int b = array[3]+array[5]+array[6]+array[8]+array[12]+array[14]+array[15]+array[16]+array[18];
	      System.out.println(b);
	      int x = 66 - a + b;
	      return x;
	}
}


