import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class wcTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIteratorPath() throws IOException {
		wc wc = new wc();
		wc.iteratorPath("src\\", ".txt");

		List<String> test = new ArrayList<String>();
		// 调用bat获取文件夹下所有文件
		Process p = Runtime.getRuntime().exec(".\\src\\test.bat");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(p.getInputStream(), "gbk"));
		String out = null;
		while ((out = bReader.readLine()) != null) {
			test.add(out);
		}
		bReader.close();

		// System.out.println(test);
		// System.out.println(wc.filePath);
		assertEquals(test, wc.filePath);

	}

	@Test
	public void testOutput() throws IOException {
		wc wc = new wc();
		// 实例化Filehandler
		Filehandler handler = new Filehandler();
		// 测试文件和停词表
		String path = "src\\junittest.txt";
		int isStop = 1;
		String[] StopList = { "public" };
		handler.FileHandle(path, isStop, StopList);
		String buffer = "";
		String[] args = { "-w" };

		assertEquals("junittest.txt, 单词数: 14" + "\r\n", wc.Output(args, handler, buffer));

	}

}
