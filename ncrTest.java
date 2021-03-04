public class ncrTest{

public static void main(String[] args){

int count = 0;

  for(int i=1; i<=97; i++){
    for(int j=i+1; j<=98; j++){
      for(int k=j+1; k<=99; k++){
        for(int x=k+1; x<=100; x++){
          count++;
        }
      }
    }
  }
System.out.println(count);
}
}
