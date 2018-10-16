import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ByteArrayOutStreamExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		OutputStream out = null;
		try {
			int[] a = null;
			a[1] = 12;
		} catch (Exception e) {
			//e.printStackTrace(System.out);
			out = new ByteArrayOutputStream();
			PrintStream outAsTextStream = new PrintStream(out);
			e.printStackTrace(outAsTextStream);
		}
		byte[] writtenBytes = ((ByteArrayOutputStream) out).toByteArray();
		String result = "result: " + new String(writtenBytes, "UTF8");
		System.out.println(result);
	}
	
}
