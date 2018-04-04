package test;

import prog.Comparer;
import prog.Encrypt;
import prog.Word;

import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Mytest {

	@Test
    public void classEncryptTest() {
        Encrypt enct = new Encrypt();
        assertNotNull(enct);
    }
	
	@Test
    public void classWordTest() {
        Word wor = new Word();
        assertNotNull(wor);
    }
	
	@Test
    public void getSetOnlySymbolTest() {
        Word wor = new Word();
        wor.setElementToEncrypt('q');
        char expected = 'q';
        char resault = wor.getElementToEncrypt();
        assertEquals(expected, resault);
    }
	
	@Test
    public void getSetOnlySymbolTest2() {
        Word wor = new Word();
        wor.setElementToEncrypt('v');
        char expected = 'v';
        char resault = wor.getElementToEncrypt();
        assertEquals(expected, resault);
    }
	
	@Test
    public void getSetSymbolsTest() {
        Word wor = new Word();
        char[] elements = {
            'q', 'v', 'c'
        };
        wor.setElements(elements);
        char[] expected = {'q', 'v', 'c'};
        char[] resault = wor.getElements();
        assertArrayEquals(expected, resault);
    }
	
	@Test
    public void getSetSymbolsTest2() {
        Word wor = new Word();
        char[] elements = {
            'q', 'v', 'c', 'a', 'b', 'd', 'f', 'g'
        };
        wor.setElements(elements);
        char[] expected = {'q', 'v', 'c', 'a', 'b', 'd', 'f', 'g'};
        char[] resault = wor.getElements();
        assertArrayEquals(expected, resault);
    }
	
	@Test
    public void getSetSymbolsChangeTest() {
        Word wor = new Word();
        char[] elements = {
            'z', 'y', 'x'
        };
        wor.setChangeSymbol(elements);
        char[] expected = {'z', 'y', 'x'};
        char[] resault = wor.getChangeSymbol();
        assertArrayEquals(expected, resault);
    }
	
	@Test
    public void getSetSymbolsChangeTest2() {
		Word wor = new Word();
        char[] elements = {
        	'x', 'y', 'z', 'a', 'b', 'd', 'f', 'g'
        };
        wor.setChangeSymbol(elements);
        char[] expected = {'x', 'y', 'z', 'a', 'b', 'd', 'f', 'g'};
        char[] resault = wor.getChangeSymbol();
        assertArrayEquals(expected, resault);
    }
	
	@Test
    public void classComparerTest() {
        Comparer comp = new Comparer();
        assertNotNull(comp);
    }
	
	@Test
    public void congruenceTwoArrayTest() {
        char[] elemFirst = {
            'a', 'b', 'c'
        };
        char[] elemSecond = {
            'x', 'y', 'z'
        };
        boolean expected = false;
        boolean resault = Comparer.compareSymbolArrays(elemFirst, elemSecond);
        assertEquals(expected, resault);
    }
	
	@Test
    public void congruenceTwoArrayTest2() {
        char[] elemFirst = {
            'x', 'y', 'z'
        };
        char[] elemSecond = {
            'x', 'y', 'z'
        };
        boolean expected = true;
        boolean resault = Comparer.compareSymbolArrays(elemFirst, elemSecond);
        assertEquals(expected, resault);
    }
	
	@Test
    public void lengthTwoArrayTest() {
        char[] elemFirst = {
            'a', 'b', 'c', 'd', 'x', 'y', 'z', 'i', 'e', 'q', 'f', 'g'
        };
        char[] elemSecond = {
            'a', 'b', 'c', 'f', 'g'
        };
        boolean expected = false;
        boolean resault = Comparer.compareSymbolArrays(elemFirst, elemSecond);
        assertEquals(expected, resault);
    }
	
	@Test
    public void equalsWordTest() {
        Word wor1 = new Word();
        char[] elem1 = {'a', 'b'};
        char[] elem2 = {'b', 'a'};
        wor1.setElements(elem1);
        Word wor2 = new Word();
        wor2.setElements(elem2);
        boolean expected = false;
        boolean resault = wor1.equals(wor2);
        assertEquals(expected, resault);
    }
	
	@Test
    public void equalsWordTest2() {
        Word wor1 = new Word();
        wor1.setElements(null);
        wor1.setChangeSymbol(null);
        Word wor2 = null;
        boolean expected = false;
        boolean resault = wor1.equals(wor2);
        assertEquals(expected, resault);
    }
	
	@Test
    public void hashCodeTest() {
		Word wor1 = new Word();
		Word wor2 = new Word();
        int expected = wor1.hashCode();
        int resault = wor2.hashCode();
        assertEquals(expected, resault);
    }
	
	@Test
    public void hashCodeTest2() {
		Word wor1 = new Word();
		Word wor2 = new Word();
        char[] elem = {'a', 'b'};
        wor2.setElements(elem);
        boolean expected = false;
        boolean resault = Integer.compare(wor1.hashCode(), wor2.hashCode()) == 0;
        assertEquals(expected, resault);
    }
	
	@Test
    public void getSetKeyEncryptorTest() {
        Encrypt encr = new Encrypt();
        Word expected = new Word();
        char[] elemFirst = {
            'a', 'b', 'c'
        };
        char[] elemSecond = {
            'z', 'v', 'g'
        };
        expected.setElements(elemFirst);
        expected.setChangeSymbol(elemSecond);
        encr.setWord(expected);
        Word resault = encr.getWord();
        assertEquals(expected, resault);
    }
	
}
