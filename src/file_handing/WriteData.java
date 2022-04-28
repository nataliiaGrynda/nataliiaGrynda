package src.file_handing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
  public static void main(String[] args) throws InterruptedException {

/*
Create a file called as studentList.txt
After creating, put a wait for 5 seconds, and delete it
 */



      /*
        Create a file called as studentList.txt
        After creating, put a wait for 5 seconds, and delete it
         */

    File file = new File("studentList.txt");

    try {
      file.createNewFile();
      Thread.sleep(5000);
      //write some info to file
      FileWriter fileWriter = new FileWriter("studentList.txt");
      fileWriter.write("Abe\n");
      fileWriter.write("Vita\n");
      fileWriter.write("Torrie\n");
      fileWriter.write("Abe");
      fileWriter.close();//safe the file.... newer forget to close / safe file because all info is going to be deleted

      Thread.sleep(5000);

    } catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      // file.delete();
    }

    System.out.println("End of the program!");




  }
}
