package by.milavitsky.module1;

import by.milavitsky.module1.StringUtils;

public class App {
    public static void main(String[] args) {
        boolean condition = StringUtils.isAllPositiveNumbers("12", "79");
        System.out.println(condition);
    }
}
