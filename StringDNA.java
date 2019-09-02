import java.util.Arrays;
/**
 * Returns the reverse, complement, and reverse complement of half of a DNA string.
 * <br>getReverse will return reverse the DNA provided.
 * <br>getComplement will return the complement of the DNA provided.
 * <br>getReverseComplement will return the reverse complement of the DNA provided.
 *
 * @author Makarie Myers
 * @author Valentina Young-Wood
 * @version 9/2/2019
 * @param original the original half of a string of DNA
 * @return the reverse, complement, and reverse complement of the DNA
 */
public class StringDNA
{
    String rev;
    String comp;
    String revcomp;
    
    public static void main(){
        StringDNA dna = new StringDNA();
        String test = "ATG";
        dna.getReverse(test);
        System.out.println("The reverse of "+test+" is "+dna.rev);
        dna.getComplement(test);
        System.out.println("The complement of "+test+" is "+dna.comp);
        dna.getReverseComplement(test);
        System.out.println("The reverse complement of "+test+" is "+dna.revcomp);
    }
    
    public String getReverse(String original){
        String[] origin = original.split("");
        String[] reverse = new String[origin.length];
        for (int i=origin.length; i>0; i--){
            for(int x= 0; i<reverse.length; i++){
                reverse[x] = origin[i];
            }
        }
        String rev= Arrays.toString(reverse);
        //Needs to return GTA.
        return rev;
    }
    
    public String getComplement(String original){
        int index = (original.length()); //saves the length of the given string to an int
        char [] dna = original.toCharArray(); //converts the given string to a character array
        char [] comp = new char[index]; //creates a character array with a length equal to the length of the original string
        for (int i = 0; i < index; i++)
        {
            if (dna[i] == 'A') //if the given string had an A, put a T in the complement
            {
                comp[i] = 'T';
            }
            else if (dna[i] == 'T')
            {
                comp[i] = 'A';
            }
            else if (dna[i] == 'G')
            {
                comp[i] = 'C';
            }
            else if(dna[i] == 'C')
            {
                comp[i] = 'G';
            }
            else //in case the given string contained a value that wasn't A, T, C, or G
                comp[i] = '?';
        }
        String complement = new String(comp); //converts the complement char array into a string
        return complement; //returns the complement as a String
    }
    
    public String getReverseComplement(String original){
        getComplement(original);
        getReverse(comp);
        //Needs to return CAT.
        return revcomp;
    }
}
