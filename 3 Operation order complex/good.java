public class Sample1 {

    public static void main(String[] args) {
	    int i = 1;
        int total = --i * 5 - i++;
		
		assertThat( total, is(0) );
    }
}