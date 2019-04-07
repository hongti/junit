import java.io.IOException;

public class TestWcDemo {

	public static void main(String[] args) throws IOException {
		Filehandler handler = new Filehandler();
		handler.FileHandle("src\\Readme.txt", 0, null);
		String[] test = { "-w" };
		System.out.println(wc.Output(test, handler, ""));
	}

}
