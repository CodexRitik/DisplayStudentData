class Implement{
    public int rollNo(int[] mark){
        int roll_index = 0;
        int min=mark[0];
        for (int i = 0; i < mark.length; i++) {
            if(min > mark[i]){
                min = mark[i];
                roll_index = i;
            }
        }
        return roll_index;
    }
    public void display(int[] mar,String[] Nam ,int[] roll){
        int data = rollNo(mar);
        System.out.println("Name :\s"+Nam[data]+"\n"+"Roll No. :\s"+roll[data]+"\n"+"Minimum Marks :\s"+mar[data]);
    }
}
