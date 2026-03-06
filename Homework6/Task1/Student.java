package Homework6.Task1;

public class Student {

    private String name;
    private int group;
    private int course;
    private Marks marks;


    Student(String name, int group, int course, Marks marks) {

        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;

    }

    public static class Marks {

        private int mathMark;
        private int historyMark;
        private int englishMark;
        private int biologyMark;

        Marks(int mathMark, int historyMark, int englishMark, int biologyMark) {

            this.mathMark = mathMark;
            this.historyMark = historyMark;
            this.englishMark = englishMark;
            this.biologyMark = biologyMark;

        }

        public float getAverageMark() {

        float averageMark = (mathMark + historyMark + englishMark + biologyMark) / 4f;

        return averageMark;

        }
    }

    public Student.Marks getMarks() {

        return marks;

    }

    public int getCourse() {

      return course;

    }

    public String getName() {

      return name;

    }

    public void setCourse(int course) {

        this.course = course;
        
    }   
    
}
