import java.util.Scanner;
public class Tugas2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Bilangan Bulat:");
		int bil=input.nextInt();

		int total=0;
		for(int i=1;i<=bil;i++){
			if(i%2!=0){
			total +=i;
			System.out.println("Bilangan Ganjil: "+i);
		    }
	    }
		System.out.println("Jumlah Bilangan Ganjil dari 1 hingga " +bil+" = "+total);
	}
}
