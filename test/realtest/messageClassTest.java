/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package realtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author richardblewett
 */
public class messageClassTest
{
 messageClass message = new messageClass();
    public messageClassTest()
    {
    }

    @Test
    public void testGetMessage()
    {
         String expected = "I have arrived";
        String actual = message.getMessage();
        
      
        
        assertEquals(expected, actual);
    }
    
}
