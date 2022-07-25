public class Sample2 {

    public static void main(String[] args) {
	    int i = 1;
        int j = ++i;
		
		assertThat( j, is(2) );
    }
}