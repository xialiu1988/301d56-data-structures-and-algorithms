package repeatedwords;

import java.util.HashSet;

public class RepeatedWord {

    public  static void main(String[] args)
    {
        String str = "It of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String str2 = "It was a queer, sultry summer the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String str3 = "Once upon a time, there was a brave princess who...";
        String s = RepeatedWord(str);
       System.out.println("the repeated word is: "+s);
    }

    public static String RepeatedWord(String str)
    {
       if(str.isEmpty()) return "Empty String";
        str=str.replace(',', ' ');
        str = str.replace('.', ' ');
        String[] arr = str.split(" ");

        //initialize a hashset to store unique word
        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++)
        {
            arr[i]= arr[i].toLowerCase();
            if (!hs.add(arr[i]))
            {  //find the one already exsits in hashset return that word
                return arr[i];
            }

        }

        return "No repeated word in this string";
    }
}
