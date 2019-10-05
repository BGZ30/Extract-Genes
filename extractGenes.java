package FindingGenesDNA;

import java.io.*;
import java.util.*;
//import java.dnaHelp; //NOT allowed


/*
 * this program is to extract genes from a given DNA string.
 * a gene starts with 'atg' and ends with taa,tga, or tag.
 * a gene length must be a multiple of three
 */

public class extractGenes {
    public static void main(String[] args) {
    	
    	String DNA, tag;
    	List<String> genesList = new ArrayList<>();
    	//List<String> genesList = Collections.emptyList(); 
    	
    	System.out.println("Enter the DNA String");
    	Scanner scan = new Scanner(System.in);
    	DNA = scan.next();
    	
    	scan.close();
    	
    	//System.out.println(DNA);
    	
    	genesList = dnaHelp.findGenes(DNA);
    	
    	if(genesList.size()==0)
    		System.out.println("No genes found");
    	else{
    		System.out.println("Genes found: ");
    		/*for(String g : genesList)
	    		System.out.println("	"+ g);
	    	*/
    		System.out.println(genesList);
		}
    }
    
}
											       //43-36=7		//52-36=16
/*ATGCCCTAG ATGAAATAG 15 ATGGGGTAG 24 ATGCGCTAG 33 ATGCCACT43AG ATGCTCTAG 52 
  *ATGCCCTAGATGAAATAGATGGGGTAGATGCGCTAGATGCCACTAGATGCTCTAG
   Answer: ATGCCCTAG   ATGAAATAG   ATGGGGTAG   ATGCGCTAG
*/

/*
 * CATGAAATAATGATAATGGTAGATAGATGACCACTATGCCATAG
 * //Answer: ATGAAATAA  ATGGTAGATAGATGA   ATGCCATAG
 */

/*
  CCATGGTGAGAATGTCCGTCATACGTCA
  Answer: no genes
*/