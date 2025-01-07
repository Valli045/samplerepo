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
