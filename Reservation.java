import java.util.ArrayList;
import java.util.Scanner;

class Seat {
    int seatNumber;
    boolean isBooked;

    Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    void bookSeat() {
        this.isBooked = true;
    }

    void cancelBooking() {
        this.isBooked = false;
    }

    boolean isAvailable() {
        return !isBooked;
    }
}

class Bus {
    int busNumber;
    ArrayList<Seat> seats;

    Bus(int busNumber, int totalSeats) {
        this.busNumber = busNumber;
        seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    void displayAvailableSeats() {
        System.out.println("Available seats for Bus " + busNumber + ":");
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                System.out.print(seat.seatNumber + " ");
            }
        }
        System.out.println();
    }

    boolean bookSeat(int seatNumber) {
        if (seatNumber <= 0 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return false;
        }

        Seat seat = seats.get(seatNumber - 1);
        if (seat.isAvailable()) {
            seat.bookSeat();
            System.out.println("Seat " + seatNumber + " Your booking has been successfully. ");
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        }
    }

    boolean cancelSeat(int seatNumber) {
        if (seatNumber <= 0 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return false;
        }

        Seat seat = seats.get(seatNumber - 1);
        if (!seat.isAvailable()) {
            seat.cancelBooking();
            System.out.println("Booking for seat " + seatNumber + " has been canceled.");
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is not booked.");
            return false;
        }
    }
}

public class Reservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus bus = new Bus(1, 40); // Example: Bus 1 with 40 seats

        while (true) {
            System.out.println("\n--- Bus Reservation System ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bus.displayAvailableSeats();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("enter your name:");
                    String name= scanner.nextLine();
                    //scanner.nextLine();
                    System.out.println("Enter your mobile no:");
                    int num= scanner.nextInt();
                    System.out.println("Age:");
                int a2=scanner.nextInt();
                scanner.nextLine();

                System.out.println("Travel Details Here ----");
            System.out.println("1.Chennai-Trichy");
            System.out.println("2.Chennai-Madurai");   
            System.out.println("3.Chennai-Kovai");   
            System.out.println("4.Chennai-Pune");   
            System.out.println("5.Chennai-Vellore");
            System.out.println("Enter your option:");
            int option=scanner.nextInt();

       System.out.println("Travel Agency List------");
    System.out.println("1.Vinayaga Agency");
      System.out.println("2.Alagapa Agency");
        System.out.println("3.ABC Agency");
          System.out.println("4.Maruki Agency");
            System.out.println("5.Megalaiya Agency");
            System.out.println("Enter your travel Agency:");
            int Agency=scanner.nextInt();
   
            System.out.println("Select your Time--->");
            System.out.println("1.6AM to 9AM");
            System.out.println("2.9AM to 12PM");
            System.out.println("3.12PM to 3PM");
            System.out.println("4.3PM to 6PM");
            System.out.println("5.6PM to 12AM");
            System.out.println("Enter you Travel Time:");
            int time=scanner.nextInt();
   
            System.out.println("Pick up point--->");
            System.out.println("1.Central");
            System.out.println("2.Paris");
            System.out.println("3.Koyambedu");
            System.out.println("4.Guidy");
            System.out.println("5.Mount");
            System.out.println("Enter your Pick up point option:");
            int pick=scanner.nextInt();
   
            System.out.println("Drop Point here--->");
            System.out.println("1.Old Bus stand");
              System.out.println("2.Old Market stand");
                System.out.println("3.New Bus stand");
                System.out.println("4.Railway Station");
                System.out.println("5.Housing board");
                System.out.println("Select your Drop Point:");
                int drop=scanner.nextInt();


 switch(option)
         {
          case 1:
            System.out.println("This is your Details here--->>");
          System.out.println(" Chennai-Trichy");
          break;
          case 2:
             System.out.println("This is your Details here--->>");
          System.out.println("Chennai-Madurai");
          break;
          case 3:   
           System.out.println("This is your Details here--->>");
          System.out.println("Chennai-Kovai");
          break;
          case 4:   
           System.out.println("This is your Details here--->>");
          System.out.println("Chennai-Pune");
          break;
          case 5:   
           System.out.println("This is your Details here--->>");
          System.out.println("Chennai-Vellore");
          break;
          case 6:
             System.out.println("This is your Details here--->>");
            System.out.println("Chennai-hydrabed");
            break;
            case 7:
                 System.out.println("This is your Details here--->>");
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


                    System.out.print("Enter seat number to book: ");
                    int seatToBook = scanner.nextInt();
                    bus.bookSeat(seatToBook);
                    break;
                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    int seatToCancel = scanner.nextInt();
                    bus.cancelSeat(seatToCancel);
                    break;
                case 4:
                    System.out.println("Thank you for using the Bus Reservation System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
