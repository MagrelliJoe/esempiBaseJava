public class EsempiCicli {
	
	public static int sum(int[] x) {
		
    int sum = 0;
	
    for (int i = 0; i < x.length; i++) {
      sum = sum + x[i];
    }
    return sum;
  }
  
  public static int max(int[] x){
	  
	int max = x[0];
	
    for (int i = 1; i < x.length; i++) {
      if (x[i] > max) { 
         max = x[i];
        }
    }
  return max;
  }
	
  public static int min(int[] x){
	  
	int min = x[0];
	
    for (int i = 1; i < x.length; i++) {
      if (x[i] < min) { 
         min = x[i];
        }
    }
  return min;
  }
  public static double med(int[] x){
	  
	double sum = x[0];
	double med=0;
	
	for (int i=1;i<x.length;i++){
		
	  sum += x[i];
	}
	med = sum / x.length; 
  return med;	 
  }
  
  public static boolean done(int[] x , int y){
	  
	boolean done = false;
	
	for(int i=0;i<x.length;i++){
	 if(x[i]==y){
	  done = true; 	
	 }
	} 
   return done;  
  }
  
  public static int equals(int[] x){
	  
   int num_repeat=0;
   int counter=0;
   
   for(int y=0;y<x.length;y++){
      for(int i=counter;i<x.length;i++){
	  
	    if(x[y]==x[i] && i!=y){
			num_repeat=x[i];
	    }   		
      }
	counter++;
    } 
  
  return num_repeat;
  }
  
  public static int mode03(int[] arr){

        int[][] map = new int[arr.length][2];

        for(int i=0;i<arr.length;i++){
            add(arr[i],map);
        }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.deepToString(map));


        return 0;
    }

    public static void add(int target,int[][] map){

        boolean found = false;
        for(int i=0;i<map.length;i++){
            int[] line = map[i];
            if(line[0] == target){
                line[1]++;
                found=true;
                break;
            }
        }
        if(!found){
            for(int i=0;i<map.length;i++){
                int[] line = map[i];
                if(line[0] == 0){
                    line[0]=target;
                    line[1]=1;
                }
            }
        }
    }
	
	 public static int mode02(int[] arr){
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int[][] map = new int[arr.length][2];

        for(int i=0;i<arr.length;i++){
            add(arr[i],map);
        }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.deepToString(map));
        int pos=0;
        int maxFreq = map[0][1];
        for(int i=1; i < map.length; i++) {
            if(map[i][1] > maxFreq) {
                maxFreq = map[i][1];
                pos = i;
            }
        }
        return map[pos][0];
    }
	
  public static void main (String [] args) {
  /* 
    for (int i = 1; i < 11; i++) {
      System.out.println(i);
    }

    int y = 1;
    while (y < 11) {
      //Stampiamo il valore y
      System.out.println(y);
      y++;
      //y = y + 1;
    }
    // se il numero è multiplo di 3, devo stampare fizz, se il numero è multiplo di 5 devo stampare buzz, se il numero è multiplo sia di 3 che di 5 devo stampare fizzbuzz, se nessuna è vera stampa solo un numero
    for (int i = 1; i < 100; i++) {
      if (i%3 == 0 && i%5 == 0) {
          System.out.println("fizzbuzz");
      } else if(i%5 == 0) {
          System.out.println("buzz");
      } else if (i%3 == 0) {
          System.out.println("fizz");
      } else {
          System.out.println(i);
      } 
    }
    
    int[] nums = new int[5];

    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[2]);
    System.out.println(nums[3]);
    System.out.println(nums[4]);
    
    nums[0] = 50;
    nums[4] = 100;
	
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (i+1)*10;
    }
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
    }
    System.out.println(sum);

    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) { 
         max = nums[i];
      }
    }
    System.out.println(max);
    
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    System.out.println(min);

     double s = 0;
    for (int i = 0; i < nums.length; i++) {
      s = s + nums[i];
    }
    System.out.println(s/nums.length);
    
    double ss = sum(nums);
    System.out.println(ss/nums.length);
	
	*/
	int[] nums2 = new int[6];
	nums2[0]=2;
	nums2[1]=2;
	nums2[2]=2;
	nums2[3]=2;
	nums2[4]=3;
	nums2[5]=3;
	
	/*for(int i=0;i<nums2.length;i++){
		nums2[i]=10+i;
	}
	*/
	
	//System.out.println(max(nums2));
	//System.out.println(min(nums2));
	System.out.println(med(nums2));
	System.out.println(done(nums2,9));
	System.out.println(equals(nums2));
    //numero = min(nums2);
	//double numero2 = med(nums2);
	//boolean verofalso = done(nums2,20);
	//numero2 = equals(nums2);
  } 

  // una funzione che riceve in input int[] e ritorna il suo massimo valore
  // una funzione che riceve in input int[] e ritorna il suo minimo valore
  // una funzione che riceve in input int[] e ritorna un double che è il suo valore medio
  // una funzione che riceve in input int[] e int e ritorna true se uno di quei valori è di int[]
  // una funzione che riceve in input int[] e ritorna il valore che appare più volte in int[]

	   
  }