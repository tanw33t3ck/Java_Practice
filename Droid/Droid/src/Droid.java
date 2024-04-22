public class Droid {
    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I’m the droid " + name + "." ;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task );
        batteryLevel -= 10;
    }

    public void energyReport(){
        System.out.println(name + " battery level: " + batteryLevel + ".");
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);

        codey.performTask("sweeping");
        codey.performTask("mopping");
        codey.performTask("cleaning windows");

        codey.energyReport();
    }
}