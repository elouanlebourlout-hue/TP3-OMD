package fr.esir.omd.ci;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FileHandlerTest {

    @Test
    public void testGeneratePdf() throws Exception {
        FileHandler fileHandler = new FileHandler();
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("PDF test", "Contenu PDF", false));

        File tempPdf = File.createTempFile("tasks-test-", ".pdf");
        tempPdf.deleteOnExit();

        fileHandler.generatePdf(tasks, tempPdf.getAbsolutePath());

        assertTrue(tempPdf.exists());
        assertTrue(tempPdf.length() > 0);
    }
}