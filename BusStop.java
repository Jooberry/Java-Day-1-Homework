class BusStop {
  private Person[] queue;

  public BusStop(){
    this.queue = new Person[9];
  }


  public int queueCount(){
    int count = 0;
    for(Person person : this.queue){
      if(person != null){
        count ++;
      }
    }
    return count;
  }

  public void addToBus(Bus bus){
    for(Person person : this.queue){
      bus.addToBus(person);
    }
    this.pickup();
  }

  public void addToBusStop(Person person){
    if(isBusStopFull()){
      return;
    }
    int queueCount = queueCount();
    this.queue[queueCount] = person;
  }

  public void pickup(){
    for(int i = 0; i < queue.length; i++){
      this.queue[i] = null;
    }
  }

  public boolean isBusStopFull(){
    return queueCount() == queue.length;
  }
}