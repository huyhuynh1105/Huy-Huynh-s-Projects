import java.util.*;
class Reservation {
  private int id;
  private String name;
  private int numguest;
  private String date;

  public Reservation(int id,String name,int numguest,String date){
    this.id=id;
    this.name=name;
    this.numguest=numguest;
    this.date=date;
  }
  public int getid(){
    return id;
  }
  public int getnumguest(){
    return numguest;
  }
  public String getname(){
    return name;
  }
  public String getdate(){
    return date;
  }
  public String printReservation(){
    return ("Reservation id number: "+id+" by the name of "+name+" with "+numguest+" guests "+" on "+date);
  }
}
class ReservationSystem{
  private ArrayList<Reservation> resrvlist = new ArrayList<>();
  private int idnum=1;

  public void addReservation(String name,int numguest,String date){
    resrvlist.add(new Reservation(idnum++,name,numguest,date));
    System.out.println("Reservation has been added to the Reservation List.");
    System.out.println(resrvlist.get(resrvlist.size()-1).printReservation());
  }
  public String cancelReservation(int id){
    for(Reservation x: resrvlist){
      if(x.getid()==id){
        resrvlist.remove(x);
        return ("Reservation number "+id+" of "+x.getname()+" with " +x.getnumguest()+" guest on "+x.getdate()+" has been cancelled.");
      }
    }
    return ("This Reservation id number is not on the Reservation List, therefore can not be cancelled. Please reserve your Reservation first in order to cancel.");
  }
  public String returnReservationPos(int id){
    for(Reservation x : resrvlist){
      if(x.getid()==id){
        return ("Your number in line is number "+(resrvlist.indexOf(x)+1));
      }
    }
    return ("Invalid ID number, please try again.");
  }
  public void getReservation(){
    if(resrvlist.size()==0){
      System.out.print("Theres no reservation yet.");
      return;
    }
    System.out.println("There has been "+resrvlist.size()+" reservations");
    for(Reservation x:resrvlist){
      System.out.println(x.printReservation());
    }
  }
}
class ReservationSystemUI extends ReservationSystem{
  public void start(){
    Scanner scan = new Scanner(System.in);
    System.out.print("* * * * * * * * * * \nWelcome to Luci's Chicken & Rice, please choose from our Reservation services menu:");
    while(true){
      
        System.out.println("");
        System.out.println("* * * * * * * * * *\n1. Make A Reservation\n2. View All Reservations\n3. Cancel Reservation\n4. Get Reservation Position Number In Line\n5. Exit Menu\n* * * * * * * * * *");
        System.out.println("Input number: ");
        int a = scan.nextInt();
        
        if(a==1){
          
          System.out.println("Please input your reservation name: ");
          scan.nextLine();
          String name = scan.nextLine();
          System.out.println("How many guest will there be: ");
          int guest = scan.nextInt();
         
          System.out.println("Whats the day for this reservation ?");
          int day = scan.nextInt();
          System.out.println("Whats the month for this reservation ?");
          int month = scan.nextInt();
          System.out.println("Whats the year for this reservation ?");
          int year = scan.nextInt();
          String date = Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
          System.out.println("");
          super.addReservation(name,guest,date);
        }
        else if (a==2){
          System.out.println("");
          super.getReservation();
        }
        else if (a==3){
          System.out.println("Input ID number to cancel the reservation");
          int id = scan.nextInt();
          System.out.println("");
          System.out.println(super.cancelReservation(id));
        }
        else if (a==4){
          System.out.println("Input your id: ");
          int id = scan.nextInt();
          
          System.out.println(returnReservationPos(id));
        }
        else if(a==5){
          break;
        }
        else{
          System.out.print("Invalid number choice, please type in the number again.");
        }
      
    }
  }
}
class Main {
  public static void main(String[] args) {
    ReservationSystemUI run = new ReservationSystemUI();
    run.start();
    System.out.println("* * * * * * * * * *\nThank you for your reservation to dine at Luci's Chicken & Rice Restaurant !\n* * * * * * * * * *");
  }
}
