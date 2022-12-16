public class Test {

    Test_Second test_second = new Test_Second();

    public static void main(String[] args) {
        System.out.println("hello!");
        System.out.println("second sysout");
        System.out.println("manual sysout");
        Test test = new Test();
        int sum = test.calculate(10,20);
        System.out.println("calculate " + sum);
        if(test.isWorking()) {
            System.out.println("yes, service is working fine");
        } else {
            System.out.println("Service status is off");
        }
        test.test_second.multiple2(10,3);
    }

    private boolean isWorking() {
       return false; // default
    }

    private int calculate(Integer num1, Integer num2) {
       return (num1 != null && num2 != null) ? num1 + num2 : 0; // 0  as default
    }
    
    public boolean isTestClass() {
        return true;
    }
}

