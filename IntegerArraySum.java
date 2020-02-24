package src.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]=new int[]{1,2,3,4,5,6,7,8,9,0};
List<Integer> list = Arrays.stream(i).boxed().collect(Collectors.toList());

int l =list.stream().mapToInt(j->j).sum();
List<Integer> k1 =list.stream().map(j->j+5).collect(Collectors.toList());

System.out.println(l);
	}

}
