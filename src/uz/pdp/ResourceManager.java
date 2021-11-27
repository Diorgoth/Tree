package uz.pdp;

public class ResourceManager {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();


        // First thread
        Thread threadOne = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});

        // Second thread
        Thread threadTwo = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});

        threadOne.start();
        threadTwo.start();

    }


}
