package ru.netology.javaqamvn.sqrservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrLimits.csv")
    void allTest( int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(min, max);
        assertEquals(expected, actual);
    }
}