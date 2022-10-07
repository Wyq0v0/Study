package Study07;

enum Enum01 {
    Spring("春天","第一"),
    Summer("夏天","第二"),
    Autumn("秋天","第三"),
    Winter("冬天","第四");
    private String name;
    private String num;

    private Enum01(String name, String num) {
        this.name = name;
        this.num = num;
    }
}
