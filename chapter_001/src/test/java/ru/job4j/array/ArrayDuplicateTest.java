package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import java.util.Arrays;
import static org.junit.Assert.assertThat;
import org.hamcrest.collection.IsArrayContainingInAnyOrder;


public class ArrayDuplicateTest {
    @Test
    public void zZzZzZ() {
        ArrayDuplicate dupDup = new ArrayDuplicate();
        String[] st = new String[] {"123","123","222","45","222","11","11","11"};
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] result = dupDup.remove(st);
        String[] b = new String[] {"123","222","45","11"};
        assertThat(b, IsArrayContainingInAnyOrder.arrayContainingInAnyOrder(result));
    }
}