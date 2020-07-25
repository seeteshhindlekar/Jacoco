package com.jacocotest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.testng.Assert;

import com.jacoco.Book;

public class BookTest {

	@Test
    public void testvalidadmin(){
        Book meo = new Book();
        assertEquals("admin is a valid user", true, meo.abc("admin", "b"));
        boolean aa = meo.abc("admin", "b");
        Assert.assertEquals(aa, true);
    }

	@Test
    public void testinvalidadmin(){
        Book meo = new Book();
        assertEquals("admin is a valid user", true, meo.abc("admin", "b"));
        boolean aa = meo.abc("seet", "b");
        Assert.assertEquals(aa, false);
    }
	
	
}
