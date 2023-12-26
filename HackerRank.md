### <b>1. Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!</b>

Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of .

Constraints

Each  has at most  digits.
Output Format

Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

<b>Sample Input</b>

9<br>
-100<br>
50<br>
0<br>
56.6<br>
90<br>
0.12<br>
.12<br>
02.34<br>
000.000<br>

<b>Sample Output</b>

90<br>
56.6<br>
50<br>
02.34<br>
0.12<br>
.12<br>
0<br>
000.000<br>
-100<br>
``` java
import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            BigDecimal bdNum1 = new BigDecimal(s[j]);
            BigDecimal bdNum2 = new BigDecimal(s[j + 1]);
            if (bdNum1.compareTo(bdNum2) == -1) {
                String smallerNum = s[j];
                s[j] = s[j + 1];
                s[j + 1] = smallerNum;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
```

### <b>2. A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .</b>

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime
Explanation

The only positive divisors of  are  and , so we print prime.

``` java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       BigInteger big = new BigInteger(sc.next());
       System.out.println(big.isProbablePrime(1)? "prime":"not prime");
    }
}
```
