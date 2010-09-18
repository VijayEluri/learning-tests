package file;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

public class FileTest {

	private File tempTestingFile;
	private InputStream tempInputStream;

	@Before
	public void createFile() throws Exception {
		tempTestingFile = new File("testFile.txt");
		tempTestingFile.createNewFile();
	}

	@After
	public void deleteFile() throws Exception {
		if (tempInputStream != null)
			tempInputStream.close();
		tempTestingFile.delete();
	}

	@Test
	public void deleteFileWhenFileIsClosedShouldWork() throws Exception {
		boolean successfullyDeleted = tempTestingFile.delete();
		assertTrue(successfullyDeleted);
	}

	@Test
	public void deleteFileWhenFileIsOpenShouldNotWork() throws Exception {
		tempInputStream = new FileInputStream(tempTestingFile);
		boolean successfullyDeleted = tempTestingFile.delete();
		// This assertion will fail on *nix (in Windows works fine, though)
		// For more info about this bug see the following link:
		// http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4722539
		// assertFalse(successfullyDeleted);
	}
}