import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FilehandlerTest {
	private Filehandler f;
	
	@Before
	public void setUp() throws Exception {
		f = new Filehandler();
		//测试文件
		String path = "src\\junittest.txt";
		//测试停词表功能
		int isStop = 1;
		String[] StopList = { "public" };
		f.FileHandle(path, isStop, StopList);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * {@link Filehandler#FileHandle(java.lang.String, int, java.lang.String[])} 的测试方法。
	 * @throws IOException 
	 */
	@Test
	public void testCountword() throws IOException {
		assertEquals(14, f.countword);
	}
	
	@Test
	public void testCountline() throws IOException {
		assertEquals(7, f.countline);

	}
	
	@Test
	public void testCountCodeLine() throws IOException {
		assertEquals(5, f.countCodeLine);

	}
	
	@Test
	public void testCountNoteLine() throws IOException {
		assertEquals(2, f.countNoteLine);
	}
	
	@Test
	public void testCountChar() throws IOException {
		assertEquals(88, f.countChar);
	}

}
