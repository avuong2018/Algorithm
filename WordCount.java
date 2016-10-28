public class WordCount
{
    static int count = 0, number;
    static int wordcount(String str)
    {
        char ch[] = new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            ch[i] = str.charAt(i);
            if(
                // if first character is not a space then it is a word:
            		((i==0) && (ch[0]!=' '))
                
                // or if after first character is not a space and before that is a space so it is a word:
            	 || ((i>0) && (ch[i]!=' ')&&(ch[i-1]==' '))
               
              ) count++;
        }
        return count;
    }   
    public static void main (String args[])
    {
        number = WordCount.wordcount("This is a program to count the number of words in a string.");    
        System.out.println("There are :  " + number + " words in my string.");
    }
}
