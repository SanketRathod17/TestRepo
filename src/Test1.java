import static org.testng.Assert.assertEquals;
@org.testng.annotations.Test
public class Test1 {
    public static void main(String[] args) {
       Temp t=new Temp();
       assertEquals(t.cal(" "),0);
    }
}

