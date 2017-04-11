import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;
  Person person;
  Bus bus;

  @Before 
  public void before() {
    this.busStop = new BusStop();
    this.person = new Person();
    this.bus = new Bus();
  }

  @Test
  public void busStopStartsEmpty(){
    assertEquals(0, this.busStop.queueCount());
  }

  @Test
  public void canFillStop(){
    this.busStop.addToBusStop(this.person);
    assertEquals(1, this.busStop.queueCount());
  }

  @Test
  public void cannotAddPersonWhenBusStopFull(){
    for(int i = 0; i < 10; i++){
      this.busStop.addToBusStop(person);
    }
    assertEquals(9, this.busStop.queueCount());
  }

  @Test
  public void busStopIsFull(){
    for(int i = 0; i < 9; i++){
      this.busStop.addToBusStop(person);
    }
    assertEquals(true, this.busStop.isBusStopFull());
  }

  @Test
  public void shouldEmptyBusStopAfterPickup(){
    this.busStop.addToBusStop(this.person);
    this.busStop.pickup();
    assertEquals(0, this.busStop.queueCount());
  }

  @Test
  public void movePersonFromBusStopToBus(){
    this.busStop.addToBusStop(this.person);
    this.busStop.addToBus(this.bus);
    assertEquals(1, this.bus.passengerCount());
  }

}