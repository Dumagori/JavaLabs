package laba4;

import laba3.model.University;
import org.junit.Assert;
import org.junit.Test;

public class UniversityWriterTest {

    @Test
    public void testFileUniversityWriter() {

        UniversityWriter universityWriter = new UniversityWriter();
        ConstantBaseGenerate constantBaseGenerate = new ConstantBaseGenerate();
        University ntuOld = constantBaseGenerate.createUniversity();

        universityWriter.writeToFile(ntuOld);
        University ntuNew = universityWriter.readFromFile();

        Assert.assertEquals(ntuNew.toString(), ntuOld.toString());
    }
}