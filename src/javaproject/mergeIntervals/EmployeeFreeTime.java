package javaproject.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
	this.start = start;
	this.end = end;
    }

    @Override
    public String toString() {
	return "["+ start + "," + end + "]";
    }
    
};

public class EmployeeFreeTime {

    public static List<Interval> findEmployeeFreeTime(List<List<Interval>> schedule) {
	List<Interval> arr = new ArrayList<>();
	for(List<Interval> inp : schedule) {
	    for(Interval intv : inp) {
		arr.add(intv);
	    }
	}
	return arr;
    }

    public static void main(String[] args) {
	List<List<Interval>> input = new ArrayList<>();
	input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(5, 6))));
	input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 3), new Interval(6, 8))));
	List<Interval> freeTime = findEmployeeFreeTime(input);
	System.out.println("freeTime : "+freeTime);
    }

}
