public class ArraysImp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size Of Student Data");
        int size = scan.nextInt();
        StudentInfo obj = new StudentInfo(size);
        int[] roll_no = new int[obj.getSize()];
        String[] name = new String[obj.getSize()];
        int[] marks = new int[obj.getSize()];
        for (int i = 0; i < roll_no.length; i++) {
            System.out.printf("Enter the Roll No. of %d Student",i);
            roll_no[i] = scan.nextInt();
            scan.nextLine();
            System.out.printf("Enter the Name Of %d Student",i);
            name[i] = scan.nextLine();
            System.out.format("Enter the Marks Of %d Student",i);
            marks[i] = scan.nextInt();
        }
        obj.setRoll_no(roll_no);
        obj.setName(name);
        obj.setMarks(marks);
        System.out.println("-----------------------------------------------------");
        System.out.println("Student Name :\s"+Arrays.toString(obj.getName()));
        System.out.println("Roll No. :\s"+Arrays.toString(obj.getRoll_no()));
        System.out.println("Marks :\s"+Arrays.toString(obj.getMarks()));
        System.out.println("-----------------------------------------------------");
        Implement imp = new Implement();
        imp.rollNo(marks);
        imp.display(marks,name,roll_no);
    }
}
