package FindingGenesDNA;

import java.util.ArrayList;
import java.util.List;

public class dnaHelp {
	public static List<String> findGenes(String dna){
    	List<String> gList = new ArrayList<>();
    	int s=0;
    	
    	while(true) {
	    	s = dna.indexOf("ATG",s);
	    	//System.out.println("s= "+s);
	    	
	    	if(s==-1)
	    		{break;}
	    	else {
	    		int tag1 = tagIndex(dna,"TAA",s);
	    		int tag2 = tagIndex(dna,"TGA",s);
	    		int tag3 = tagIndex(dna,"TAG",s);
	    		
	    		/*System.out.println("tag1= "+tag1);
	    		System.out.println("tag2= "+tag2);
	    		System.out.println("tag3= "+tag3);
	    		*/
	    		
	    		//must exclude tags that equal to -1 before getting the minimum one
	    		//int e = Math.min(tag3, Math.min(tag1, tag2));
	    		int e = optimamTag(tag1, tag2, tag3, s, dna);
	    		//System.out.println("e= "+e);
	    		
	    		if(((e-s)%3 == 0) && (e!=dna.length()))
	    			//System.out.println("Genes found: " + dna.substring(s,e+3) );
	    			gList.add(dna.substring(s,e+3));
	    		s=e+3;
	    	}	
    	}
    	
    	return gList;
    }
    
    public static int tagIndex(String dna, String tag, int st) {
    	int t = dna.indexOf(tag,st+3);
    	if(t==-1)
    		return dna.length();
    	else
    		return t;
    }
    
    public static int optimamTag(int t1, int t2, int t3, int s, String dna) {
    	int e = dna.length();
    	for(int i=0; i<3; i++) {
    		e = Math.min(t3, Math.min(t1, t2));
    		//System.out.println("e= "+e);
    		if((e-s)%3 == 0)
    			break;
    		else {
    			if(e==t1)
    				t1=tagIndex(dna,"TAA",e-2);
    			else if(e==t2)
    				t2=tagIndex(dna,"TGA",e-2);
    			else if (e==t3)
    				t3=tagIndex(dna,"TAG",e-2);;
    		}
    	}
 
    	return e;
    }

}
