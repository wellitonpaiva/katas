package com.thescientist;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.thescientist.MaxDiffLength.mxdiflg;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MaxDiffLengthTest {

    @Test
    public void knownTest() {
        List<String> a1 = Arrays.asList("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz");
        List<String> a2 = Arrays.asList("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww");
        assertThat(mxdiflg(a1, a2), is(13));
    }

    @Test
    public void when_a1_a2_size_is_one_it_should_return_0() {
        List<String> a1 = Collections.singletonList("a");
        List<String> a2 = Collections.singletonList("a");
        assertThat(mxdiflg(a1,a2), is(0));
    }

    @Test
    public void when_a1_is_empty_it_should_return_minus_one() {
        List<String> a1 = Collections.emptyList();
        List<String> a2 = Collections.singletonList("something");
        assertThat(mxdiflg(a1, a2), is(-1));
    }

    @Test
    public void when_a2_is_empty_it_should_return_minus_one() {
        List<String> a1 = Collections.singletonList("something");
        List<String> a2 = Collections.emptyList();
        assertThat(mxdiflg(a1, a2), is(-1));
    }
}
