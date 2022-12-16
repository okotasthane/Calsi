public class Test {
    public static void main(String[] args) {
        System.out.println("hello!");
        System.out.println("second sysout");
        System.out.println("manual sysout");
        Test test = new Test();
        if(test.isWorking()) {
            System.out.println("yes, service is working fine");
        } else {
            System.out.println("Service status is off");
        }
    }

    private boolean isWorking() {
       return true; // default
    }
}

