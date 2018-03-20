package katas;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static katas.Anagrams.numberNeeded;

public class AnagramsTest {

    @Test
    public void knownCaseTest() throws Exception {
        assertThat(numberNeeded("cde", "abc"), is(4));
    }

    @Test
    public void cdAndDcAnagramTest() throws Exception {
        assertThat(numberNeeded("cd", "dc"), is(0));
    }
    @Test
    public void anaAndBananaAnagramTest() throws Exception {
        assertThat(numberNeeded("ana", "banana"), is(4));
    }

}