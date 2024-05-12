import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    
    @Test
    public void addTests(){
        Assert.assertEquals(10, new Calculator().add(1, 9));
        Assert.assertEquals(9, new Calculator().add(4, 4));
    }

    public void another(){
        Assert.asserEquals(0, new Calculator().add(11, 11));
    }
    

}
