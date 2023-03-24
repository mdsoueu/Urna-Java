import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int voto55=0, voto4=0, voto23=0, voto11=0, voto84=0;
	    int votar; /* Para ler o voto */
	    int totalVotar=0; /* Número total de votos */
	    int votosValidos=0, votosInvalidos=0; /* Valiação do voto */
	    int maiorVoto; /* Para saber quem ganhou */
	    
		System.out.println("Votação");
		System.out.println("Candidato Barry Allen - 55");
		System.out.println("Candidato Peter Jason Quill - 04");
		System.out.println("Candidato Hiro Hamada - 23");
		System.out.println("Candidato Miles Gonzalo Morales - 11");
		System.out.println("Candidato Peter Benjamin Parker - 84\n");
		
		do{ /* Inicio do-while */
		    System.out.println("Digite seu voto:");
		    votar = ler.nextInt();
		    
		    switch(votar){ /* Inicio switch */
		        case 55:
		            voto55++; /* Voto para o candidato */
		            totalVotar++; /* Total de votos */
		            votosValidos++; /* Voto válido */
		            break;
		      
		        case 04:
		            voto4++; /* Voto para o candidato */
		            totalVotar++; /* Total de votos */
		            votosValidos++; /* Voto válido */
		            break;
		           
		        case 23:
		            voto23++; /* Voto para candidato */
		            totalVotar++; /* Total de votos */
		            votosValidos++; /* Voto válido */
		            break;
		            
		        case 11:
		            voto11++; /* Voto para candidato */
		            totalVotar++; /* Total de votos */
		            votosValidos++; /* Voto válido */
		            break;
		            
		        case 84:
		            voto84++; /* Voto para candidato */
		            totalVotar++; /* Total de votos */
		            votosValidos++; /* Voto válido */
		            break;
		        
		        default:
		            votosInvalidos++;
		            totalVotar++;
		            
		            if(votar !=0)
		                System.out.println("Voto Inválido!");
		    } /* Fim switch */
		} while (votar != 0); /* Fim do-while */
	
	System.out.println("\n------ Candidatos ------");
	System.out.println("Barry Allen teve "+voto55+" votos.");
	System.out.println("Peter Jason Quill teve "+voto4+" votos.");
	System.out.println("Hiro Hamada teve "+voto23+" votos.");
	System.out.println("Miles Gonzalo Morales teve "+voto11+" votos.");
	System.out.println("Peter Benjamin Parker teve "+voto84+" votos.");
	
	System.out.println("\n-------- Votos --------\n");
	System.out.println("Votos válidos: "+ votosValidos);
	System.out.println("Votos inválidos: "+ votosInvalidos);
	System.out.println("Total de Votos da Eleição: "+ totalVotar);
	
	maiorVoto = voto55;
      if (voto4 > maiorVoto)
         maiorVoto = voto4;
      if (voto23 > maiorVoto)
         maiorVoto = voto23;
      if (voto11 > maiorVoto)
         maiorVoto = voto11;
      if (voto84 > maiorVoto)
         maiorVoto = voto84;
    
    System.out.println("\n------- Candidato(s) Vencedor(es) da Eleição -------");
      if (voto55 == maiorVoto)
         System.out.println("\t\t\t\t\tBarry Allen");
      if (voto4 == maiorVoto)
         System.out.println("\t\t\t\tPeter Jason Quill");
      if (voto23 == maiorVoto)
         System.out.println("\t\t\t\t\tHiro Hamada");
      if (voto11 == maiorVoto)
         System.out.println("\t\t\t\tMiles Gonzalo Morales");
      if (voto84 == maiorVoto)
         System.out.println("\t\t\t\tPeter Benjamin Parker");
	}
}
