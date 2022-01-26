// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class UnspliceTest {
/*
    @Test
    void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Unsplice.answer();
        assertEquals(expected, actual);
    }
*/
    @Test
    void abc1()
    {
        String expected = "abc";
        String actual = Unsplice.answer("ab\\\nc");
        assertEquals(expected, actual);
    }
    
    @Test
    void abc2()
    {
        String expected = "abc";
        String actual = Unsplice.answer("abc");
        assertEquals(expected, actual);
    }
    
    @Test
    void abc3()
    {
        String expected = "ab\nc";
        String actual = Unsplice.answer("ab\nc");
        assertEquals(expected, actual);
    }
    
    @Test
    void abc4()
    {
        String expected = "\nabc\n";
        String actual = Unsplice.answer("\nabc\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void abc5()
    {
        String expected = "abc";
        String actual = Unsplice.answer("\\\nabc");
        assertEquals(expected, actual);
    }
    
    @Test
    void abcdef1()
    {
        String expected = "abcdef";
        String actual = Unsplice.answer("ab\\\ncd\\\nef");
        assertEquals(expected, actual);
    }
    
    @Test
    void abcdef2()
    {
        String expected = "abcdef";
        String actual = Unsplice.answer("abc\\\ndef");
        assertEquals(expected, actual);
    }
    
    @Test
    void abcdef3()
    {
        String expected = "abc\n\\def";
        String actual = Unsplice.answer("abc\n\\def");
        assertEquals(expected, actual);
    }
    
    @Test
    void abcdef4()
    {
        String expected = "abc\\def";
        String actual = Unsplice.answer("abc\\def");
        assertEquals(expected, actual);
    }
    
    @Test
    void abcdef5()
    {
        String expected = "abc\ndef";
        String actual = Unsplice.answer("abc\ndef");
        assertEquals(expected, actual);
    }
    
    @Test
    void the_cat_in_the_hat1()
    {
        String expected = "The cat in the hat";
        String actual = Unsplice.answer("The cat in the hat");
        assertEquals(expected, actual);
    }
    
    @Test
    void the_cat_in_the_hat2()
    {
        String expected = "The cat in the hat";
        String actual = Unsplice.answer("The cat i\\\nn the hat");
        assertEquals(expected, actual);
    }
    
    @Test
    void the_cat_in_the_hat3()
    {
        String expected = "The cat i\n\\n the hat";
        String actual = Unsplice.answer("The cat i\n\\n the hat");
        assertEquals(expected, actual);
    }
    
    @Test
    void the_cat_in_the_hat4()
    {
        String expected = "The\\n cat\n in the\n hat";
        String actual = Unsplice.answer("The\\n cat\n in the\n hat\\\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void the_cat_in_the_hat5()
    {
        String expected = "The cat in the hat";
        String actual = Unsplice.answer("T\\\nhe c\\\nat i\\\nn t\\\nhe h\\\nat");
        assertEquals(expected, actual);
    }
    
    @Test
    void fungus1()
    {
        String expected = "fungus";
        String actual = Unsplice.answer("fun\\\ngus");
        assertEquals(expected, actual);
    }
    
    @Test
    void fungus2()
    {
        String expected = "fungus";
        String actual = Unsplice.answer("fungus\\\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void fungus3()
    {
        String expected = "fun\\ngus";
        String actual = Unsplice.answer("\\\nfun\\ngus");
        assertEquals(expected, actual);
    }
    
    @Test
    void fungus4()
    {
        String expected = "\\fun\\gus\n";
        String actual = Unsplice.answer("\\\\\nfun\\gus\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void fungus5()
    {
        String expected = "fungus";
        String actual = Unsplice.answer("\\\nfu\\\nng\\\nus\\\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void n1()
    {
        String expected = "n";
        String actual = Unsplice.answer("\\\n\\\nn");
        assertEquals(expected, actual);
    }
    
    @Test
    void n2()
    {
        String expected = "n";
        String actual = Unsplice.answer("\\\nn\\\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void n3()
    {
        String expected = "n";
        String actual = Unsplice.answer("n\\\n\\\n");
        assertEquals(expected, actual);
    }
    
    @Test
    void n4()
    {
        String expected = "nnn";
        String actual = Unsplice.answer("n\\\nn\\\nn");
        assertEquals(expected, actual);
    }
    
    @Test
    void n5()
    {
        String expected = "n\\nn\nn";
        String actual = Unsplice.answer("\\\nn\\nn\nn");
        assertEquals(expected, actual);
    }
}
