package uz.pdp;

public class PrintSpooler {
    private static PrintSpooler spooler;

    private static boolean initialized = false;

    private PrintSpooler(){}

    private void init() {
        // Code to initialize our printer spooler goes here
          String name = " ugvyiybi";
        System.out.println(name);
        init1();

    }
    private void init1() {
        // Code to initialize our printer spooler goes here
        String name = "11111";
        System.out.println(name);

    }


    public static synchronized PrintSpooler getInstance() {

        if(initialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();
        spooler.init1();
        initialized = true;

        return spooler;

    }
}
