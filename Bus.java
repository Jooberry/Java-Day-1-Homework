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

  public void dropoff(){
    for(int i = 0; i < passengers.length; i++){
      this.passengers[i] = null;
    }
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

}