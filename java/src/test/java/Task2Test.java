import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void test1element() {
        assertEquals(13, task2.solve());
    }

}
