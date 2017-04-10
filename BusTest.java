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

  @Test
  public void canFillBus(){
    this.bus.addToBus(this.person);
    assertEquals(1, this.bus.passengerCount());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i < 9; i++){
      this.bus.addToBus(person);
    }
    assertEquals(true, this.bus.isBusFull());
  }

}