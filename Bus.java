public class Bus{
  private Person[] passengers;

  // public void add(Person person){

  // }

  public int passengerCount(){
    int count = 0;
    for(Person person : this.passengers){
      if(person != null){
        count ++;
      }
    }
    return count;
  }

}