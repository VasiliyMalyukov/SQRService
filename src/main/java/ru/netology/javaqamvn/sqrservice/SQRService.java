package ru.netology.javaqamvn.sqrservice;

import static java.lang.Math.pow;

public class SQRService {
    public int calculateSQR(int min, int max) {
        int count = 0;
        for (int x = 10; x <= 99; x++) {
            if (x * x <= max && x * x >= min) {
                ++count;
            }
        }
        return count;
    }
}
