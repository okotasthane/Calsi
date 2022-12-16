public class Test {
    public static void main(String[] args) {
        System.out.println("hello!");
        System.out.println("second sysout");
        System.out.println("manual sysout");
        int sum = new Test().calculate(10,20);
        System.out.println("calculate " + sum);
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

    private int calculate(int num1, int num2) {
       return (num1 != null && num2 != null) ? num1 + num2 : 0; // 0  as default
    }
}

