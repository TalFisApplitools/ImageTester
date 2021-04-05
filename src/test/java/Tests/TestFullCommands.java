package Tests;

import com.yanirta.ImageTester;
import org.junit.Test;

public class TestFullCommands {

    @Test
    public void testPDFforcedNamePromptNew() {
        ImageTester.main("-f TestData/b/Lorem1.pdf -fn MyNewName -pn".split(" "));
    }

    @Test
    public void testPDFforcedName() {
        ImageTester.main("-f TestData/b/Lorem1.pdf -fn MyForcedName".split(" "));
    }

    @Test
    public void testPDFflatBatchName() {
        ImageTester.main("-f TestData/b/Lorem1.pdf -fb MyFlatBatch".split(" "));
    }

    @Test
    public void testFolderSimple() {
        ImageTester.main("-f TestData/ -th 10 -di 200".split(" "));
    }

    @Test
    public void testFolderSimpleDebug() {
        ImageTester.main("-f TestData/ -debug".split(" "));
    }


    @Test
    public void testPDFSimple() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem2.pdf".split(" "));
    }

    @Test
    public void testPDFFolder() {
        ImageTester.main("-f TestData/b/c/JustPDF/".split(" "));
    }


    @Test
    public void testPDFSimpleDebug() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem2.pdf -debug".split(" "));
    }

    @Test
    public void testPDFSplit() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem3.pdf -th 10 -debug -st".split(" "));
    }

    @Test
    public void PDFSplitWithUtilities() {
        ImageTester.main("-f TestData/diffs/ -th 10 -debug -st -gg -of Artifacts".split(" "));
    }

    @Test
    public void testPDFPages() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem3.pdf -th 10 -sp 1,2,4-5 -debug".split(" "));
    }

    @Test
    public void testPDFPagesSplit() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem3.pdf -th 10 -sp 1,2,4-5 -debug -st".split(" "));
    }

    @Test
    public void testWithSecureProxy() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem3.pdf -th 10 -sp 1,2,4-5 -pr http://my.proxy.com:8080,user,pass -debug -st".split(" "));
    }

    @Test
    public void testBatchNotifications() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem2.pdf -nc".split(" "));
    }

    @Test
    public void testBatchNotificationsLongFlag() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem2.pdf --notifyCompletion".split(" "));
    }

    @Test
    public void testPDFFolderWithBatchNotifications() {
        ImageTester.main("-f TestData/b/c/JustPDF/ -nc".split(" "));
    }

    //to add id use the following:
    //-fb BATCH_NAME_HERE<>BATCH_ID_HERE

    @Test
    public void testBatchNotificationsWithFlatBatchAndId() {
        ImageTester.main("-f TestData/b/c/JustPDF/Lorem2.pdf -fb EmailNotificationBatch<>customBatchID -nc".split(" "));
    }

    @Test
    public void testBatchNotificationsWithAll() {
        ImageTester.main("-f TestData/ -nc".split(" "));
    }

    @Test
    public void testBatchNotificationsMultibatch() {
        ImageTester.main("-f TestData/b/c -nc".split(" "));
    }


    @Test
    public void testImageScaling1() {
        ImageTester.main("-f TestData/a/ -ms 1000".split(" "));
    }

    @Test
    public void testImageScaling2() {
        ImageTester.main("-f TestData/a/ -ms x1000".split(" "));
    }

    @Test
    public void testImageScaling3() {
        ImageTester.main("-f TestData/a/ -ms 1000x1000".split(" "));
    }

    @Test
    public void testImageScaling4() {
        ImageTester.main("-f TestData/a/ -ms 1000x".split(" "));
    }
}
