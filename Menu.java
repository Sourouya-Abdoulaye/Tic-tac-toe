package jeux_tic_tac_toc;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] cases = {    { '1','2','3' } ,
							  { '4','5','6' } ,
							  { '7','8','9' } 
												} ;
		// une liste qui contient les endroit deja jouer
		int[] endroit = new int[9];
		
		Tic_tac_toc tic_tac_toc = new Tic_tac_toc();
		
		Scanner clavier = new Scanner(System.in);
		
		// unitilisation de la variable tours
		int tours=1;
		// il faut afficher la case avant de commencer
		tic_tac_toc.afficher_cases(cases);
	do {
		// nous savons que c'est tour apres tour , si le joueur 1 fait un tour , les joueur va 
		// faire le dexieme tours, un suit de suite . pour cela j'ai considerer que si,le
		// le tours paire donc c'est le joueur 2 ca.
		char boule = 'X';
		if (tours%2==0) {
			 boule = 'O';
		}
		// nous allons demander a l'utilisateur de choisire l'endroit qu'il veut metrre
		System.out.print("veuillez saisire le numero: ");
		int position=clavier.nextInt();
		
		

		
		System.out.println();
		// nous allons appeller la fonction qui va positionner la boule 
		
		//nous allons verifier si l'endroit est libre avant de positionner
		if (tic_tac_toc.verifier_endroit(position, tours-1,endroit)) {
			// si l'endroit est libre on remplis ca 
			endroit[tours-1]=position;
			tic_tac_toc.positionnement(position,boule,cases);
			tic_tac_toc.afficher_cases(cases);	
			// si l'endroit est valide c'est en se moment on compte
			tours +=1;
		}
		
		else {
			System.out.println("cette position est occuper");
		}
		
		
		boolean verifier = tic_tac_toc.verification_succes(cases, boule);
		if (verifier) {
			System.out.println("Le joueur de la boule "+boule+" à avez gagner");
			tours=10;
		}
		
		
		
	} while (tours !=10);	
		
	clavier.close();	
				
	
	}
}







