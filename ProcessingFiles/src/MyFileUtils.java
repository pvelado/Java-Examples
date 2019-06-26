import com.paulovelado.exceptions.FooRuntimeException;

public class MyFileUtils {
	public int subtract10FromLargerNumber(int number) throws Exception {
		if (number < 10) {
			throw new FooRuntimeException("The number passed was less than 10 ...");
		}
		return number -10;
	}

}
