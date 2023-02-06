import java.util.Scanner;
public class SortingHat {
	
		//public static java.util.Scanner console = new java.util.Scanner(System.in);
		public static java.util.Random random = new java.util.Random();
		Scanner console = new Scanner(System.in);
		public static final int NUMERO_CASE = 4;
		public static String[] gryffindor;
		public static String[] slytherin;
		public static String[] hufflepuff;
		public static String[] ravenclaw;
        
		public static void talkingHat(){
			StringBuilder cod = new StringBuilder("    *");
			for(int i=0;i<3;i++){
		
				System.out.println(cod);
				cod.deleteCharAt(0);
				cod.append("**");
			}

			String easy = "It's so easy!";
			String hard = "It's so hard...";
			String maybe = "Mmmm...you're perfect for all houses!But...";
			String confused = "I don't know...";
			int rand = randomRange(NUMERO_CASE);
			
			switch(rand){
				case 0:
				  System.out.println(easy);
				  break;
				case 1:
				  System.out.println(hard);
				  loading(3);
				  break;
				case 2:
				  System.out.println(maybe);
				  loading(2);
				  break;
				case 3:
				  System.out.println(confused);
				  loading(1);
				  break;
			}
		}
		
		public static void loading(int ripetizioni){
			switch(ripetizioni){
		      case 1:
			    console.nextLine();
			    break;
		      case 2:
			    for(int i=0;i<2;i++){
					console.nextLine();
				}
				break;
			  case 3:
			     for(int i=0;i<3;i++){
					console.nextLine();
				}
				break;
			}
		}
		
		public static String ask(String prompt){
			System.out.print(prompt + ":");
			String answer = console.nextLine();
	        return answer;
		}
		
		public static int askNumber(String prompt){
			System.out.println(prompt + ":");
			int answer = console.nextInt(); 
			console.nextLine();
			return answer;
		}
	        
		public static int hashName(String name){
			String noSpace = name.replace(" ","").toLowerCase();
			
	        int hash = 0;
			for(int i=0;i<Math.min(10,noSpace.length());i++){
				hash += noSpace.codePointAt(i) * Math.pow(7, i);
			}
			
			if(randomRange(4) == 3){
				hash += 3;	
			}
	        
			return hash;
		}
		
	    public static int randomRange(int n){
			return random.nextInt(n);
		}

		public static void assegnazioneCaseRimanenze(int controllo,String nome){
			boolean cicla = false;
			do{
				cicla=false;
				
	            switch(controllo){
				case 0: 
				 	if(gryffindor[gryffindor.length-1] == null){
						gryffindor[gryffindor.length-1]=nome;
						talkingHat();
						System.out.println(nome + " " + "\u00E9 un.....Gryffindor!!!");
						
					}else{
						controllo = randomRange(NUMERO_CASE);
						cicla= true;
					}
	                   break;
					   
				case 1: 
				 	if(slytherin[slytherin.length-1] == null){
						slytherin[slytherin.length-1]=nome;
						talkingHat();
						System.out.println(nome + " " + "\u00E9 un.....Slytherin!!!");
					
					}else{
						controllo = randomRange(NUMERO_CASE);
						cicla= true;
					}
	                   break;
					   
				case 2: 
				 	if(hufflepuff[hufflepuff.length-1] == null){
						hufflepuff[hufflepuff.length-1]=nome;
						talkingHat();
						System.out.println(nome + " " + "\u00E9 un.....Hufflepuff!!!");
						
					}else{
						controllo = randomRange(NUMERO_CASE);
						cicla= true;
					}
	                   break;
					   
				case 3: 
				 	if(ravenclaw[ravenclaw.length-1] == null){
						ravenclaw[ravenclaw.length-1]=nome;
						talkingHat();
						System.out.println(nome + " " + "\u00E9 un.....Ravenclaw!!!");
						
					}else{
						controllo = randomRange(NUMERO_CASE);
						cicla= true;
					}
	                    break;
				}
			}while(cicla);

		}

		public static void assegnazioneCase(int controllo,String nome){
	              
			controllo = controllo%NUMERO_CASE;
			/*if (controllo < 0) {
				                   //se dovesse dare un numero negativo.
				controllo +=2;
			}*/
			boolean cicla = true;
			do{
				switch(controllo){
				case 0:
					for(int i=0;i<gryffindor.length-1;i++){
	   		 			if(gryffindor[i] == null){
							gryffindor[i]=nome;
							talkingHat();
							System.out.println(nome + " " + "\u00E9 un.....Gryffindor!!!");
							cicla= false;
							break;
						}
					}       
					if(cicla==true) {
				      controllo += 1;
					}
	    		    break;
						
				case 1:	
					for(int i=0;i<slytherin.length-1;i++){
	   		 			if(slytherin[i] == null){
							slytherin[i]=nome;
							talkingHat();
							System.out.println(nome + " " + "\u00E9 un.....Slytherin!!!");
							cicla= false;
							break;
						}
					}         
					if(cicla==true) {
					  controllo+= 1;
					}
	    			break;
						
				case 2:
					for(int i=0;i<hufflepuff.length-1;i++){
	   		 			if(hufflepuff[i] == null) {
							hufflepuff[i]=nome;
							talkingHat();
							System.out.println(nome + " " + "\u00E9 un.....Hufflepuff!!!");
							cicla= false;
							break;
	   		 	        }
					}
	   		 		if(cicla==true) {
					  controllo+=1;
	   		 		}
				    break;
						
				case 3:
	   		 		for(int i=0;i<ravenclaw.length-1;i++){
	   		 			if(ravenclaw[i] == null){
							ravenclaw[i]=nome;
							talkingHat();
							System.out.println(nome + " " + "\u00E9 un.....Ravenclaw!!!");
							cicla= false;
							break;
						}
					}
	   		 	    if(cicla==true) {
	   		 	      controllo -= 3;
	    		    }
					break;
				}
				
			}while(cicla);
		}

	    public static void main(String[] args) {
		
		System.out.println("Benvenuto nella scuola di JavaHogwarts!");
		System.out.println("Il cappello selezionatore vi assegnera' alla vostra casa.");
		int numStudenti = askNumber("Quanti studenti ci sono quest'anno?");
		int rimanenti = numStudenti%NUMERO_CASE;
		int grandezzaCasa = (numStudenti-rimanenti)/NUMERO_CASE;
		
        gryffindor = new String[grandezzaCasa+1];
		slytherin = new String[grandezzaCasa+1];
		hufflepuff = new String[grandezzaCasa+1];
		ravenclaw = new String[grandezzaCasa+1];
		
		for(int i=0;i<numStudenti-rimanenti;i++){
		    String nome =ask("Qual'\u00E9 il tuo nome giovane programmatore?");
			assegnazioneCase(hashName(nome),nome);
		}
		
		System.out.println("Sono rimasti " + rimanenti + " studenti fuori!");
		
		for(int i=0;i<rimanenti;i++){
			String nome = ask("Qual'\u00E9 il tuo nome giovane programmatore?");
			int n = randomRange(NUMERO_CASE);
			assegnazioneCaseRimanenze(n,nome);
		}

		System.out.println(java.util.Arrays.toString(gryffindor)+ " " + "Gryffindor");
		System.out.println(java.util.Arrays.toString(slytherin)+ " " + "Slytherin");
		System.out.println(java.util.Arrays.toString(hufflepuff)+ " " + "Hufflepuff");
		System.out.println(java.util.Arrays.toString(ravenclaw)+ " " + "Ravenclaw");
		System.out.println("Ora che vi ho smistati nelle vostre case...che il vostro nuovo anno magico abbia inizio!!!");
	}

}
