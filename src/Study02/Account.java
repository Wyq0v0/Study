package Study02;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else{
            System.out.println("名字不合规，设为默认值：无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        }else{
            System.out.println("余额必须大于20，设为默认：0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6){
        this.pwd = pwd;
        }else{
            System.out.println("密码不合规，必须是六位，设为默认：123456");
            this.pwd = "123456";
        }
    }
}
