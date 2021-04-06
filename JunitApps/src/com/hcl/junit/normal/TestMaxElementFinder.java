package com.hcl.junit.normal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestMaxElementFinder {
public void testFindMax() {
	MaxElementFinder maxElmFinder=new MaxElementFinder();
	int scores[]= {1,-3,-4,0,-2};
	int max=maxElmFinder.FindMax(scores);
	assertEquals(1,maxElmFinder.FindMax(scores));
}
}
