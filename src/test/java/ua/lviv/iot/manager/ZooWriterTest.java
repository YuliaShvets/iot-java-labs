package ua.lviv.iot.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class ZooWriterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void writeCSV() throws IOException {
        try (FileReader expectedReader = new FileReader("src/test/resources/expected.csv");
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("result.csv");
             BufferedReader actualBR = new BufferedReader(actualReader);) {
            String line1 = expectedBR.readLine();
            String line2 = actualBR.readLine();
            ZooWriter.writeCSV();
            Assertions.assertEquals(line1, line2);
        }
    }
}