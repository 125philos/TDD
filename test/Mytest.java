package test;

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
	
}
