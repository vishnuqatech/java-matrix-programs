import java.util.*;
public class  MatrixProgramss18{
public static void main(String args[] ){
for(int i=1;i<=6;i++){
for(int j=1;j<=11;j++){
if(j>= (2*i-1) && (j-(2*i-1)) % 2 == 0){ 
 System.out.print("* ");
}else{
System.out.print(" ");
}

}
System.out.println( );
}

}
}