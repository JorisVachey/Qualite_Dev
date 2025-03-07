import static org.junit.Assert.assertEquals;

import java.io.FileReader;

import org.junit.*;

import com.google.gson.Gson;
public class TestsBoxes {
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }
    /** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add(new Thing("truc1"));
        b.add(new Thing("truc2"));
    }

    @Test
    void emptyBoxDoesNotContain()
    {
        Box b = new Box();
        Thing t = new Thing(null);
        assertEquals(false, b.contains(t));
    }

    
}