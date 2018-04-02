package test;

import prog.Encrypt;
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
}
