/**
 * Returns the reverse, complement, and reverse complement of half of a DNA string.
 * <br>getReverse will return reverse the DNA provided.
 * <br>getComplement will return the complement of the DNA provided.
 * <br>getReverseComplement will return the reverse complement of the DNA provided.
 *
 * @author MaKarie Myers
 * @author Valentina Young-Wood
 * @version 9/2/2019
 * @param original the original half of a string of DNA
 * @return the reverse, complement, and reverse complement of the DNA
 */
public class StringDNA
{
    public static void main(){
        StringDNA dna = new StringDNA();
        System.out.println(dna.getReverseComplement("ATG"));
        //String test = "ATG";
        //System.out.println("The reverse of "+test+" is "+dna.getReverse(test));
        //System.out.println("The complement of "+test+" is "+dna.getComplement(test));
        //System.out.println("The reverse complement of "+test+" is "+dna.getReverseComplement(test));
    }
    
    public String getReverse(String original){
        int index = (original.length());
        char[] origin = original.toCharArray();
        char[] reverse = new char[index];
        int j = 0;
        for (int i=index-1; i>=0; i--)
        {
            reverse[j] = origin[i];
            j++;
        }
        String rev= new String(reverse);
        return rev;
        //Needs to return GTA.
    }
    
    public String getComplement(String input){
        int index = (input.length()); //saves the length of the given string to an int
        char [] dna = input.toCharArray(); //converts the given string to a character array
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
        //Needs to return TAC.
    }
    
    public String getReverseComplement(String original){
        String revComp = getReverse(getComplement(original));
        //getComplement(original);
        //getReverse(comp);
        //Needs to return CAT.
        return revComp;
    }
}
