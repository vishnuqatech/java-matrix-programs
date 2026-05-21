import java.util.*;
public class  MatrixPrograms14{
public static void main(String args[] ){
/*for(int i=1;i<=13;i++){
for(int j=1;j<=7;j++){
if( (i<=7 &&  j<=8-i ) ||  (i>=7 && j<=i-6 )){ 
 System.out.print("* ");
}else{
System.out.print("  ");
}
}
System.out.println( );
}
*/
for(int i=7;i>=0;i--){
for(int j=1;j<=i;j++){
 System.out.print("* ");
}
System.out.println( );
}

for(int i=2;i<=7;i++){
for(int j=1;j<=i;j++){
 System.out.print("* ");
}
System.out.println( );
}

}
}