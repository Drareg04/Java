public class array{
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        float min = ages[0];
        float max = ages[0];
        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            if (age > max){
                max = age;
            }else if (age < min) {
                min = age;
            }
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;
        float diff = max-min;
        // Print the average
        System.out.println("The average age is: " + avg + "\nThe highest number is " + max + "\nThe lowest number is " + min + "\nThe difference between the highest and lowest numbers is " + diff);
    }
}