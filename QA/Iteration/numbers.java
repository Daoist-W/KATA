
public class Numbers {
    
    // variables to store String numbers
        String[] digits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    public int numbers1 (int num) {
        // first digit 
        int digit1 = num / 10;

        // second digit
        int digit2 = num % 10;

        return digit2 + digit1;
    }


    public static String numbers2(int num) {

        if(num < 1 || num > 99) {
            return "input out of bounds";
        }

        // first digit
        int digit1 = num / 10;

        // second digit
        int digit2 = num % 10;

        if (num < 10) {
            return digits[digit2 - 1];
        } else if (num >= 10 && num < 20) {
            return teens[digit2 - 1];
        } else if (num >= 20) {
            String output = tens[digit1 - 1] + "-" + digits[digit2 - 1];
            return output;
        }
        return "";
    }

    public static String numbers34(int num) {
        String output;

        if (num < 1 || num > 9999) {
            return "input out of bounds";
        }

        // thousands
        int thousands = num / 1000;

        // hundreds
        int hundreds = (num - thousands * 1000) / 100;

        // tens
        int digit1 = (num - 100 * hundreds - thousands * 1000) / 10;

        // digit
        int digit2 = num % 10;


        if (num < 10) {
            return digits[digit2 - 1];
        } else if (num >= 10 && num < 20) {
            return teens[digit2 - 1];
        } else if (num >= 20 && num < 100) {
            output = tens[digit1 - 1] + "-" + digits[digit2 - 1];
            return output;
        } else if (num >= 100 && num < 1000) {
            if (digit1 == 1 && digit2 > 0) {
                output = digits[hundreds - 1] + "-hundred-" + teens[digit2 - 1];
            } else {
                output = digits[hundreds - 1] + "-hundred-" + tens[digit1 - 1] + "-" + digits[digit2 - 1];
            }
            return output;
        } else if (num >= 1000 && num < 10000) {
            if (digit1 == 1 && digit2 > 0) {
                output = digits[thousands - 1] + "-thousand-" + digits[hundreds - 1] + "-hundred-" + teens[digit2 - 1];
            } else {
                output = digits[thousands - 1] + "-thousand-" + digits[hundreds - 1] + "-hundred-" + tens[digit1 - 1] + "-" + digits[digit2 - 1];
            }
            return output;
        }
        return "";
    }



    public String numberRevisited (int num) {

        for(String digit: digits){
            System.out.println(digit);
        }

        for(String teen: teens){
            System.out.println(teen);
        }

        for(String ten: tens){
            for(String digit: digits){
                System.out.println(ten + "-" + digit);
            }
        }


    }
}