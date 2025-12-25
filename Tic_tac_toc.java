package jeux_tic_tac_toc;


public class Tic_tac_toc {
	
	public void afficher_cases(char[][] cases) {
		System.out.println(cases[0][0]+"  | "+cases[0][1]+"| "+cases[0][2] );
		System.out.println("---+--+---");
		System.out.println(cases[1][0]+"  |"+cases[1][1]+" | "+cases[1][2] );
		System.out.println("---+--+---");
		System.out.println(cases[2][0]+"  |"+cases[2][1]+" | "+cases[2][2] );
	}

	
	public void positionnement(int position,char boule ,char[][] cases) {
		switch (position) {
		case 1:
			cases[0][0]=boule;
			break;
		case 2:
			cases[0][1]=boule;
			break;
		case 3:
			cases[0][2]=boule;
			break;
		case 4:
			cases[1][0]=boule;
			break;
		case 5:
			cases[1][1]=boule;
			break;
		case 6:
			cases[1][2]=boule;
			break;
		case 7:
			cases[2][0]=boule;
			break;
		case 8:
			cases[2][1]=boule;
			break;
		case 9:
			cases[2][2]=boule;
			break;
		default:
			System.out.println("ce numero ne correspond pas");
			break;
		}
		
		
	}
	
	
	
	public boolean verifier_endroit(int position,int tours,int[] endroit) {
		
		for (int endroit_occuper: endroit) {
			//System.out.println("endoir"+endroit_occuper+" position "+position);
			if (endroit_occuper==position) {
				return false;
			}
			
		} return true; 
	
	}
	
	
	public boolean verification_succes(char[][] ma_case,char boule) {
		for (int i = 0; i < 3; i++) {
			if ((ma_case[i][0]==boule && ma_case[i][1]==boule && ma_case[i][2]==boule) || 
				(ma_case[0][i]==boule && ma_case[1][i]==boule && ma_case[2][i]==boule )	)		
			{
				return true;
				
			}
				
			else if ((ma_case[0][0]==boule && ma_case[1][1]==boule && ma_case[2][2]==boule) ||
					(ma_case[0][2]==boule && ma_case[1][1]==boule && ma_case[2][0]==boule)	) 
			{
				return true;
			}
			
			
			
		}
		return false;
		
	}
	
	
	
	

}
