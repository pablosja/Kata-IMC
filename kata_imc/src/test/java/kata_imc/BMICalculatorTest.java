package kata_imc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BMICalculatorTest {

    @Test
    void testCalculateBMI() {
        double weight = 70;
        double height = 1.75;
        double expectedBMI = 22.86;
        assertEquals(expectedBMI, BMICalculator.calculateBMI(weight, height), 0.01);

        weight = 60;
        height = 1.60;
        expectedBMI = 23.44;
        assertEquals(expectedBMI, BMICalculator.calculateBMI(weight, height), 0.01);

        weight = 50;
        height = 0.1;
        expectedBMI = 5000.0;
        assertEquals(expectedBMI, BMICalculator.calculateBMI(weight, height), 0.01);

        weight = 0;
        height = 1.80;
        expectedBMI = 0.0;
        assertEquals(expectedBMI, BMICalculator.calculateBMI(weight, height), 0.01);
    }

    @Test
    void testClassifyBMI() {
        double bmi = 15.0;
        String expectedClassification = "Severe thinness";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 16.5;
        expectedClassification = "Moderate thinness";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 17.5;
        expectedClassification = "Mild thinness";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 22.0;
        expectedClassification = "Normal weight";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 27.0;
        expectedClassification = "Overweight";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 32.0;
        expectedClassification = "Class I obesity";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 37.0;
        expectedClassification = "Class II obesity";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));

        bmi = 41.0;
        expectedClassification = "Class III obesity";
        assertEquals(expectedClassification, BMICalculator.classifyBMI(bmi));
    }

    @Test
    void testCalculateBMIWithZeroHeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            BMICalculator.calculateBMI(70, 0);
        });
    }
}
