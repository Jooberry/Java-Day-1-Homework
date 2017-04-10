public class Bus{
  private Person[] passengers;

  public Bus(){
    this.passengers = new Person[9];
  }


  public int passengerCount(){
    int count = 0;
    for(Person person : this.passengers){
      if(person != null){
        count ++;
      }
    }
    return count;
  }

  public void addToBus(Person person){
    if(isBusFull()){
      return;
    }
    int passengerCount = passengerCount();
    this.passengers[passengerCount] = person;
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

}