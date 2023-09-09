class Average {
    private static Average instance;
    
    private Average() {
        
    }
    
    public static Average getInstance(){
        if (instance == null) {
            instance = new Average();
        }
        return instance;
    }
    
    //Function that calculates the grades
    public double calculateAverage(double prelimGrade, double midtermGrade, double prefinalGrade, double finalGrade) {
        return (prelimGrade+midtermGrade+prefinalGrade+finalGrade) / 4.0;
    }
}