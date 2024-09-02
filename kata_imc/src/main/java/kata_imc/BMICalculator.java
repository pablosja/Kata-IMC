package kata_imc;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0.");
        }
        return weight / (height * height);
    }

    public static String classifyBMI(double bmi) {
        if (bmi < 16) {
            return "Severe thinness";
        } else if (bmi >= 16 && bmi < 17) {
            return "Moderate thinness";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "Mild thinness";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Class I obesity";
        } else if (bmi >= 35 && bmi < 40) {
            return "Class II obesity";
        } else {
            return "Class III obesity";
        }
    }
}
