package ru.netology.javaqamvn;

import ru.netology.javaqamvn.sqrservice.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int min = 200;
        int max = 9000;
        int count = service.calculateSQR(min, max);

        System.out.println(count);
    }
}