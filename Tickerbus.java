import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAC() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public void displayBusInfo() {
        System.out.println("Bus no: " + busNo + ", AC: " + ac + ", Total capacity: " + capacity);
    }
}

class Booking {
    String passengerName;
    int busNo;
    int mobileno;
    Date date;}
    System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Mobile Number:");
        Long num=sc.nextLong();

           System.out.println("Travel Details Here ----");
            System.out.println("1.Chennai-Trichy");
            System.out.println("2.Chennai-Madurai");   
            System.out.println("3.Chennai-Kovai");   
            System.out.println("4.Chennai-Pune");   
            System.out.println("5.Chennai-Vellore");
            System.out.println("Enter your option:");
            int option=sc.nextInt();

       System.out.println("Travel Agency List------");
    System.out.println("1.Vinayaga Agency");
      System.out.println("2.Alagapa Agency");
        System.out.println("3.ABC Agency");
          System.out.println("4.Maruki Agency");
            System.out.println("5.Megalaiya Agency");
            System.out.println("Enter your travel Agency:");
            int Agency=sc.nextInt();
   
            System.out.println("Select your Time--->");
            System.out.println("1.6AM to 9AM");
            System.out.println("2.9AM to 12PM");
            System.out.println("3.12PM to 3PM");
            System.out.println("4.3PM to 6PM");
            System.out.println("5.6PM to 12AM");
            System.out.println("Enter you Travel Time:");
            int time=sc.nextInt();
   
            System.out.println("Pick up point--->");
            System.out.println("1.Central");
            System.out.println("2.Paris");
            System.out.println("3.Koyambedu");
            System.out.println("4.Guidy");
            System.out.println("5.Mount");
            System.out.println("Enter your Pick up point option:");
            int pick=sc.nextInt();
   
            System.out.println("Drop Point here--->");
            System.out.println("1.Old Bus stand");
              System.out.println("2.Old Market stand");
                System.out.println("3.New Bus stand");
                System.out.println("4.Railway Station");
                System.out.println("5.Housing board");
                System.out.println("Select your Drop Point:");
                int drop=sc.nextInt();
            
                 System.out.println("Enter you No.of Seat:");
                int seat=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your 1st person Details here--->");
                System.out.println("Name:");
                String n1=sc.nextLine();
                System.out.println("Age:");
                int age=sc.nextInt();
                 System.out.println("Gender:");
                  sc.nextLine();
                 String gender=sc.nextLine();
                  System.out.println("Mobile No:");
                  Long no=sc.nextLong();
                System.out.println("Enter your 2nd person Details here--->");
                sc.nextLine();
                System.out.println("Name:");
                String n2=sc.nextLine();
                System.out.println("Age:");
                int a2=sc.nextInt();
                 System.out.println("Gender:");
                 sc.nextLine();
                 String ge2=sc.nextLine();
                  System.out.println("Mobile No:");
                  Long no2=sc.nextLong();
                  sc.nextLine();
                  System.out.println("Enter your mobile number:");
                  int o=sc.nextInt();
              /*    System.out.println("Please enter the OTP:");
                  
                  System.out.println("Enter Your Booking Confirmation:");
                    String input = sc.nextLine();
                  if (input.equalsIgnoreCase("yes")) 
                  {
            System.out.println("Your booking has been successfully confirmed! ---->");
            }
            else 
            {
            System.out.println("Your booking is invalid!");
            }*/

         switch(option)
         {
          case 1:
          System.out.println(" Chennai-Trichy");
          break;
          case 2:
          System.out.println("Chennai-Madurai");
          break;
          case 3:   
          System.out.println("Chennai-Kovai");
          break;
          case 4:   
          System.out.println("Chennai-Pune");
          break;
          case 5:   
          System.out.println("Chennai-Vellore");
          break;
          case 6:
            System.out.println("Chennai-hydrabed");
            break;
            case 7:
              System.out.println("chennai-krishnagiri");
              break;
         }
    switch(Agency)
    {
      case 1:
      System.out.println("Your agency is Vinayaga");
      break;
      case 2:
      System.out.println("Your agency is Alagapa ");
      break;
      case 3:
      System.out.println("Your agency is ABC ");
      break;
      case 4:
      System.out.println("Your agency is Maruki ");
      break;
      case 5:
      System.out.println("Your agency is Megalaiya ");
      break;
      case 6:
        System.out.println("Your agenycy is maruthi ");
        break;
        case 7:
          System.out.println("your agency is lauxri");
          break;
    }
    switch(time){
      case 1:
        System.out.println("Your selectale time is 6AM to 9AM");
        break;
        case 2:
            System.out.println("Your selectale time is 9AM to 12PM");
            break;
            case 3:
            System.out.println("Your selectale time is 12PM to 3PM");
            break;
            case 4:
            System.out.println("Your selectale time is 3PM to 6PM");
            break;
            case 5:
            System.out.println("Your selectale time is 6PM to 12AM");
            break;
    }
    switch(pick){
      case 1:
        System.out.println("This is your pick point Central");
        break;
        case 2:
            System.out.println("This is your pick point Paris");
            break;
            case 3:
            System.out.println("This is your pick point Koyambedu");
            break;
            case 4:
            System.out.println("This is your pick point Guidy");
            break;
            case 5:
            System.out.println("This is your pick point Mount");
            break;
            case 6:
              System.out.println("THis is your pick point Centeral");
              break;
              case 7:
                System.out.println("This is your pick point Tambaram");
                break;
    }
    switch(drop){
      case 1:
           System.out.println("This is your Drop point Old Bus stand");
              break;
              case 2:
              System.out.println("This is your Drop point Old Market stand");
                break;
                case 3:
                System.out.println("This is your Drop point New Bus stand");
                break;
                case 4:
                System.out.println("This is your Drop point Railway Station");
                break;
                case 5:
                System.out.println("This is your Drop point Housing board");
                break;
                case 6:
                  System.out.println("This is your Drop point Fish Market");
                  break;
    }

    Booking() {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter your passenger name:");
        passengerName = sc.next();
        System.out.println("Enter your mobile number:");
        mobileno = sc.nextInt();*/
        
        System.out.println("Enter bus no:");
        busNo = sc.nextInt(); 
        while(busNo < 1 || busNo > 3) { // Adjust the logic based on your bus numbers
         System.out.println("Invalid Bus no....");
         break;}
        System.out.println("Enter date (dd-MM-yyyy):");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        
        try {
            date = dateFormat.parse(dateInput);1
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }
}

public class Tickerbus {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 4));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3, true, 3));

        Scanner sc = new Scanner(System.in);
        for (Bus b : buses) {
            b.displayBusInfo();
           }

        int userOpt = 1;
        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
            userOpt = sc.nextInt();
            if (userOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry, Bus is full. Try another bus or date.");
                }
            }
        }
        sc.close();
    }
}
