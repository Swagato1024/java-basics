enum TrafficLight {
  RED("Stop", 3),
  YELLOW("Wait", 1),
  GREEN("Go", 3);

  private final String messageToShow;
  private final int duration;

  private TrafficLight(String messageToShow, int duration) {
    this.messageToShow = messageToShow;
    this.duration = duration;
  }

  private  int getDuration() {
    return this.duration ;
  }

  private void showMessage() {
    System.out.println(this.messageToShow);
  }

  public static void simulateTrafficLight() {
    while(true) {

    for(TrafficLight light: TrafficLight.values()) {
      light.showMessage();

        try{
          Thread.sleep(light.getDuration() * 1000);
          }catch(InterruptedException e){
            System.out.println(e);
            }    
    }
      System.out.println("------------------------------");
    }
  }
}
