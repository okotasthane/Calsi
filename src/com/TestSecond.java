package src.com;

public class TestSecond {
    public int multiple2(Integer num1, Integer num2) {
        System.out.println("yes");
        this.showMsg("great!");
        return num1 * num2;
    }

    private void showMsg(String msg) {
        System.out.println(msg);
    }
}
