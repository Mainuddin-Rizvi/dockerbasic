import java.util.Properties;

class Test{
    public static void printSystemProperties(){
        System.out.println("printing system properties using java");
        Properties prop = System.getProperties();
        System.out.println(prop);
    }

    public static void main(String[] args){
        System.out.println("Java Program started");
        printSystemProperties();
    }
}