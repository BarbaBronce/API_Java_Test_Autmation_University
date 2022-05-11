package taudemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithAssertionsTest {
    @Test
    public void firstAssertion(){
        assertEquals(1,2);
    }
    @Test
    public void secondAssertion(){
        assertEquals(3,4);
    }
}
