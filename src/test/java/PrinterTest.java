import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void noOfPages(){
        assertEquals(50, printer.noOfPages());
    }

    @Test
    public void print(){
        assertEquals(60 & 10, printer.print(10, 4));
    }

    @Test
    public void cantPrint(){
        assertEquals(100 & 50, printer.print(15, 15));
    }
    
}
