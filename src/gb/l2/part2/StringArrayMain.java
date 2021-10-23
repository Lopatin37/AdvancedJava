package gb.l2.part2;

import gb.l2.part2.exceptions.MyArrayDataException;
import gb.l2.part2.exceptions.MyArraySizeException;
import gb.l2.part2.myclasses.StringArrayHandler;

public class StringArrayMain {
    public static void main(String[] args) {
        StringArrayHandler stringArrayHandler = new StringArrayHandler();
        String[][] strings = {{"1", "2", "3", "4"}, {"5", "6", "eight", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}};
        try{
            System.out.println(stringArrayHandler.getSum(strings));
        }catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
            System.out.println("count = " + e.getCount());
        }catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
