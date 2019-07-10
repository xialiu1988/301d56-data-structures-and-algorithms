package repeatedwords;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void repeatedWord() {
        String str3 = "Once upon a time, there was a brave princess who...";
        String s = RepeatedWord.RepeatedWord(str3);
        assertEquals("should get word a", "a", s);
    }

    @Test
    public void repeatedWordfromstring() {
        String str2 = "It was a queer, sultry summer the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String s = RepeatedWord.RepeatedWord(str2);
        assertEquals("should get word summer", "summer", s);
    }

    @Test
    public void cantestemptystring(){
        String s = RepeatedWord.RepeatedWord("");
        assertEquals("Empty String","Empty String",s);
    }


    @Test
    public void cantestNorepeatedString(){
        String s = RepeatedWord.RepeatedWord("no repeated");
        assertEquals("No repeated word in this string","No repeated word in this string",s);
    }
}