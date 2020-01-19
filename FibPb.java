public class FibPb{
public static int nbFibLeq(long n){
int a=0;int b=1; int c=0; int j=0;
while(c<=n){
c=a+b;
a=b;
b=c; j++; }
return j;
}
}