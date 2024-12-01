import org.junit.Before;
import org.junit.Test;
public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actual = converter.convert( 100);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert3() {
        String expected = "B";
        String actual = converter.convert( 89);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert4() {
        String expected = "B";
        String actual = converter.convert(80);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert5() {
        String expected = "C";
        String actual = converter.convert( 79);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert6() {
        String expected = "C";
        String actual = converter.convert(70);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert7() {
        String expected = "D";
        String actual = converter.convert( 69);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert8() {
        String expected = "D";
        String actual = converter.convert(60);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert9() {
        String expected = "E";
        String actual = converter.convert( 59);
        assert expected.equals( actual );
    }
    @Test
    public void testConvert10() {
        String expected = "E";
        String actual = converter.convert(50);
        assert expected.equals( actual );
    }

}




