import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before 
  public void before() {
    this.bus = new Bus();
    this.person = new Person();
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, this.bus.passengerCount());
  }
}