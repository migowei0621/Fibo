
public class fibo {
public static void main(String[] args) {
	int[] result =fibo(40);
	for (int num : result) {
		System.out.println(num+",");
	}
}


public static int[] fibo(int num) {
	int[] result=new int[num];
	if (num==1) {
		result[0]=1;
	}else if (num==2){
		result[0]=1;
		result[1]=1;
	}else {
		result[0]=1;
		result[1]=1;
		for (int i = 2; i <num ; i++) {
			result[i]=result[i-1]+result[i-2];
		}
	}
	return result;
}
}
