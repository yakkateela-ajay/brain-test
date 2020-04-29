package service;


public class PersonalityCalculator
{
	public String findYourBrainType(String options)
	{
		System.out.println(options);
		int x = findAnswers(options);
		
	      if(x>=20 && x <= 55){
	    	  return "leftbrained";
	      }
	      else if(x>=56 && x <=64){
	    	  return "noclearpreference";
	      }
	      else{
	    	  return "rightbrained";
	      }
	
	}
	public int findAnswers(String options)
	{
		 String[] values = options.split(",");
	     int size = values.length;
	     System.out.println(size);
	      int [] array = new int [size];
	      for(int i=0; i<size; i++) {
	         array[i] = Integer.parseInt(values[i]);
	         System.out.println(array[i]);
	      }
	      int a = (array[0]+array[1]+array[2]+array[4]+array[7]+array[9]+array[10]+array[11]+array[13]+array[17]+array[19]);
	      System.out.println(a);
	      int b = (array[3]+array[5]+array[6]+array[8]+array[12]+array[14]+array[15]+array[16]+array[18]);
	      System.out.println(b);
	      int x = 66 - a + b;
	      System.out.println(x);
	      return x;
	}
}


