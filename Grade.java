public class Grade {
    public static void main(String[] args){
        Average calculator = Average.getInstance();
        
        //Declaration of variables
        double prelimGrade = 89.00;
        double midtermGrade = 80.00;
        double prefinalGrade = 94.00;
        double finalGrade =  88.3;
        
        //Process
        double average = calculator.calculateAverage(prelimGrade, midtermGrade, prefinalGrade, finalGrade);
        //Output
        System.out.printf("%.2f%n", average);
    }
}