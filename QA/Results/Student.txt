class Student {
    // field variables
    String name;
    HashMap<String, Exam> exams = new HashMap<>(10);

    // constructors
    public Student() {
        this("unknown");
    }

    public Student(String name) {
        this.name = name;
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void putExam(String subject, int marks) {
        Exam newExam = new Exam(subject, marks);
        this.exams.put(newExam.getSubject(), newExam);
    }

    public void putExams(HashMap<String, Integer> exams) {
        for (Map.Entry<String, Integer> exam : exams.entrySet()) {
            this.putExam(exam.getKey(), exam.getValue());
        }
    }
}