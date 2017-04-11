public class Bus{
  private Person[] passengers;

  public Bus(){
    this.passengers = new Person[9];
  }


  public int passengerCount(){
    int count = 0;
    for(Person person : this.passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void addToBus(Person person){

    /*
      When passengers.length equals passengerCount. 

      leave and dont run anything else in this method.
    */
    if(isBusFull()){
      return;
    }
    int passengerCount = passengerCount();

    /*
      When i create a new bus, passengerCount will return 0 because all nulls and inside my passengerCount method I ignore nulls when counting.

      So when I add a person, it will look like this

      this.passengers[0] = person;

      After this person is added, passengerCount will return 1. So if i tried to add another person, it will now look like this:

      this.passengers[1] = person;

      So, if I did this, passenger count will now be 2. So next add would look like this

      this.passengers[2] = person;

    */

    this.passengers[passengerCount] = person;
  }

  public void dropoff(){
    for(int i = 0; i < passengers.length; i++){
      this.passengers[i] = null;
    }
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

}