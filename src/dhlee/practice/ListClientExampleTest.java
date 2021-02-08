package dhlee.practice;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListClientExampleTest {

    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        assertThat(list).isInstanceOf(ArrayList.class);
    }

}
