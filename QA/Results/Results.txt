class Results {
    // field variables
    HashMap<String, Student> students = new HashMap<>(30); // for storing student data
    ArrayList<String> strArray = new ArrayList<>(100); // for displaying results
    NumberFormat formatter = new DecimalFormat("#0.00"); // for percentage data

    int total = 0; // total student score
    int maxMarks = 0; // sum of all possible marks from exams taken for a given student
    String percentage; // % of max marks achieved by student
    double passFactor = 0.6d;
    float passScore; // minimum no. of overall marks needed to for overall pass
    String status;

    // constructors
    public Results() {
    }

    public Results(Student student) {
        this.students.put(student.getName(), student);
    }

    public Results(Student[] students) {
        for (Student student : students) {
            this.students.put(student.getName(), student);
        }
    }

    // methods
    public void addStudent(Student student) {
        this.students.put(student.getName(), student);
    }

    public void addStudents(Student[] students) {
        for (Student student : students) {
            this.students.put(student.getName(), student);
        }
    }

    public void removeStudent(String name) {
        this.students.remove(name);
    }

    public void removeStudents(String[] names) {
        for (String name : names) {
            this.removeStudent(name);
        }
    }

    // display methods
    public ArrayList<String> displayResults(String studentName) {
        strArray.clear();
        this.total = 0;
        var data = students.get(studentName).exams;
        strArray.add(String.valueOf("Student Name: " + studentName));
        strArray.add("GRADES");

        for (Map.Entry<String, Exam> item : data.entrySet()) {
            var subject = item.getKey();
            var mark = item.getValue().getResult();
            var maxMark = item.getValue().maxScore;
            if (mark < maxMark * passFactor) {
                status = " FAILED";
                strArray.add(item.getKey() + " -> " +
                        item.getValue().getResult() + " " +
                        item.getValue().getPercentage() + "%" + status);
            } else {
                status = " PASSED";
                strArray.add(item.getKey() + " -> " +
                        item.getValue().getResult() + " " +
                        item.getValue().getPercentage() + "%" + status);
            }
            // calculating the total marks a student scored, and the overall highest possible marks for all exams sat
            this.total += item.getValue().getResult();
            this.maxMarks += item.getValue().maxScore;
        }

        // processing total score and max marks
        float totalF = (float) this.total;
        float maxMarkF = (float) this.maxMarks;
        percentage = formatter.format(totalF / maxMarkF * 100);
        passScore = (float) (maxMarkF * passFactor);
        if (totalF < passScore || status.equals(" FAILED")) {
            status = " FAILED";
            strArray.add("TOTAL: " + this.total + " " + percentage + "%" + status);
        } else {
            status = " PASSED";
            strArray.add("TOTAL: " + this.total + " " + percentage + "%" + status);
        }

        for (String line : strArray) {
            System.out.println(line);
        }

        return strArray;

    }

}
