package transport.src.model;
import transport.src.exceptions.*;
import transport.src.enums.*;
import java.io.*;
import java.util.*;

public class Bus extends Transport {
    private static final short MAX = 150;
    private final short capacity = 30;
    private boolean isEntered = false;
    private short number;
    public static double price = 0.5;
    private Route route;
    private HashMap map = new HashMap<Integer, ArrayList<Route>>();
    
    public Bus() {

    }

    public Bus(short number) throws IllegalNumberException {
        if(number > MAX) throw new IllegalNumberException("Number must be less than " + MAX);
        this.number = number;
    }
    public Bus(Route route) {
        this.route = route;
    }

    public short getCapacity() {
        return capacity;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

   

    @Override
    public void enter(Card card) throws InsufficientCashException {
        Date date = new Date();
        long mills = date.getTime();
        long anothermills = 0;
        if(isEntered) {
            anothermills = mills;
            mills = date.getTime();
            if(mills - anothermills == 9000000) price = 0.4;
        }
        else isEntered = true;
        if(card.getStatus() == Status.STUDENT) {
            if(card.getCash() < (price - 0.3)) throw new InsufficientCashException("There's Insufficient " + 
                    ((price - 0.3) - card.getCash()) +  " on your card");
            card.setCash(card.getCash() - price + 0.3); 
            System.out.println("Your remaining cash is " + card.getCash());
        }
        else if(card.getStatus() == Status.DEFAULT){
            if(card.getCash() < price) throw new InsufficientCashException("There's Insufficient " + 
                    ((price) - card.getCash()) +  " on your card");
            card.setCash(card.getCash() - price);
            System.out.println("Your remaining cash is " + card.getCash());
        }
        else if(card.getStatus() == Status.PENSIONER) {
            if(card.getCash() < (price - 0.2)) throw new InsufficientCashException("There's Insufficient " + 
                    ((price - 0.2) - card.getCash()) +  " on your card");
            card.setCash(card.getCash() - price + 0.2);
            System.out.println("Your remaining cash is " + card.getCash());
        }
    }
    @Override
    public HashMap readRoutes() throws IOException {
        int num = 0;
        ArrayList <Route> routes = new ArrayList<Route>();
        BufferedReader in = null;
        try {
           in = new BufferedReader(new FileReader("src/transport/routefolder/" + this.number));
           String read = null;
           while ((read = in.readLine()) != null) {
           String[] splited = read.split("\\s+");
           for(int i=1; i<splited.length; i++) {
               routes.add(new Route(Address.valueOf(splited[i-1]), Address.valueOf(splited[i])));
           }
           map.put(num, routes);
    }
}
    catch (IOException e) {
        e.printStackTrace();
     }
        return map;
    }
    public String getByRoute() {
        File folder = new File("src/transport/routefolder/");
        File[] listOfFiles = folder.listFiles();
        ArrayList <Route> routes = new ArrayList<Route>();
        BufferedReader in = null;
        boolean isOrigin = false;
           boolean isDestination = false;
        for(File file : listOfFiles) {
            try {
           in = new BufferedReader(new FileReader(file));
           String read = null;
           while ((read = in.readLine()) != null) {
           String[] splited = read.split("\\s+");
           
           String origin = String.valueOf(route.getOrigin());
           String destination = String.valueOf(route.getDestination());
           for(int i=0; i<splited.length; i++) {
               if(splited[i].equals(origin)) isOrigin = true;
               if(splited[i].equals(destination)) isDestination = true;
           }
           if(isOrigin && isDestination) return file.getName();
    }
}
    catch (IOException e) {
        e.printStackTrace();
     }
        }
        return "not found";
    }
    @Override
    public String toString() {
        String str = "";
        str += "Max numbering of buses is " + MAX + System.lineSeparator();
        str += "Price of our service is " + price + "gel" + "for students and pensioners - " +  (price-0.3) + "for pupils it's free" + System.lineSeparator();
        return str;
    }
}
