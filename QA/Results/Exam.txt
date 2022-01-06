class Exam {
    // field variables
    String subject;
    int result;
    float maxScore = 150;
    float percentage;

    // constructors
    public Exam() {
    }

    public Exam(String subject, int marks) {
        this.subject = subject;
        this.result = marks;
        this.percentage = marks / maxScore * 100;
    }

    public String getSubject() {
        return subject;
    }

    public int getResult() {
        return result;
    }

    public String getPercentage() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(this.percentage);
    }
}