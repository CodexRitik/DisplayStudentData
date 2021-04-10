class StudentInfo{ // Student Class
    private int size; // Here All information Of Student are Private
    private int[] roll_no = new int[size];
    private String[] name = new String[size];
    private int[] marks = new int[size];

    public student(int size){ //Constructer 
        this.size = size;
    }
    /*
    Getter and Setter Methods 
    */
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setRoll_no(int[] roll_no) {
        this.roll_no = roll_no;
    }
    public void setName(String[] name) {
        this.name = name;
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }

    public int[] getRoll_no() {
        return roll_no;
    }

    public String[] getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
}
