package gb.l2.part2.myclasses;

import gb.l2.part2.exceptions.MyArrayDataException;
import gb.l2.part2.exceptions.MyArraySizeException;

import java.util.stream.Stream;

public class StringArrayHandler {
    public int getSum(String[][] strings) {
        if (Stream.of(strings).mapToInt(m->m.length).sum() != 16) throw new MyArraySizeException("Размер массива недопустим");
        int count = 0;
        int rowNumber = 0;
        for (String[] string:strings) {
            for(int i = 0; i < string.length; i++) {
                try {
                    count += Integer.parseInt(string[i]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать текст " + string[i] + " в число в ячейке [" +
                            rowNumber + "][" + i + "]", count);
                }
            }
            rowNumber++;
        }
        return count;
    }
}
