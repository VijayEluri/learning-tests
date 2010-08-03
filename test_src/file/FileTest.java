package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FileTest {

  private File        tempTestingFile;
  private InputStream tempInputStream;

  @Before
  public void createFile() throws Exception {
    tempTestingFile = new File( "testFile.txt" );
    tempTestingFile.createNewFile();
  }

  @After
  public void deleteFile() throws Exception {
    if ( tempInputStream != null ) tempInputStream.close();
    tempTestingFile.delete();
  }

  @Test
  public void deleteFileWhenFileIsClosedShouldWork() throws Exception {
    boolean successfullyDeleted = tempTestingFile.delete();
    assertTrue( successfullyDeleted );
  }

  @Test
  public void deleteFileWhenFileIsOpenShouldNotWork() throws Exception {
    tempInputStream = new FileInputStream( tempTestingFile );
    boolean successfullyDeleted = tempTestingFile.delete();
    assertFalse( successfullyDeleted );
  }
}