# Java


### <b>Program on 1-Dimension Array</b><br>
``` java
import java.util.Scanner;

/*
 * Program to store and retrieve name of the employees
 */
public class ArraysCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number of employee: ");
		int n = sc.nextInt();//5
		/*
		 * [] 		----> 1-Dimension array
		 * [][]		----> 2-Dimension array
		 */
		String arr[] = new String[n];

		//Storing the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the name of the Employee no: "+(i+1));
			arr[i]=sc.next();
			/*
			 * arr[0]=Rohit
			 * arr[1]=Gill
			 * arr[2]=Virat
			 * arr[3]=Surya
			 * arr[4]=MSD
			 */
		}
		//Fetching the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("the name of the Employee no: "+(i+1)+" is = "+arr[i]);
		}
	}
}

```
---
### <b>Program on 2-Dimensional Array.</b><br>
``` java
import java.util.Scanner;

/*
 *  Company		Employee
 *     0			3
 *     1			3
 *     2			3
 *     3			3
 *     
 *  Write a code to collect the names of employees from each company
 * 
 * 2 entities ----> 2 loops ----> 2 [] ----> 2-Dimensional Array
 */
public class ArraysCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number of companies: ");
		int m = sc.nextInt();//5

		System.out.println("Enter to number of employees in each company: ");
		int n = sc.nextInt();//5

		String arr[][] = new String[m][n];

		//Storing the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside company no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of employee no:"+(j+1));
				arr[i][j]=sc.next();
			}
			/*
			 * arr[0][0]=Rohit
			 * arr[0][1]=Gill
			 * arr[0][2]=Virat
			 * -----------------
			 * arr[1][0]=Surya
			 * arr[1][1]=MSD
			 * arr[1][2]=Raina
			 * -----------------
			 * arr[2][0]=Rahul
			 * arr[2][1]=Kaif
			 * arr[2][2]=Yuvraj
			 * -----------------
			 * arr[3][0]=Sachin
			 * arr[3][1]=Laxman
			 * arr[3][2]=Balaji
			 */
		}
		//Fetching the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside company no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) {

				System.out.println("the name of the Employee no: "+(j+1)+" is = "+arr[i][j]);
			}
		}
	}
}
```
---
### <b>Program on 3-Dimensional array</b><br>
``` java
import java.util.Scanner;

/*
 *  Organization Company	Employee
 *   	0		    0			3
 *   				1			3
 *     	1			0			3
 *     				1			3
 *     
 *  Write a code to collect the names of employees from each company
 * 
 * 2 entities ----> 2 loops ----> 2 [] ----> 2-Dimensional Array
 */
public class ArraysCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number of organizations: ");
		int a = sc.nextInt();//5

		System.out.println("Enter to number of companies in each organization: ");
		int m = sc.nextInt();//5

		System.out.println("Enter to number of employees in each company of each organization: ");
		int n = sc.nextInt();//5

		String arr[][][] = new String[a][m][n];//---> 3-D

		//Storing the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside organization no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) //companies
			{
				System.out.println("Inside company no: "+(j+1));

				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of employee no:"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
			/*
			 * arr[0][0][0]=Rohit
			 * arr[0][0][1]=Gill
			 * arr[0][0][2]=Virat
			 * arr[0][1][0]=Rohit
			 * arr[0][1][1]=Gill
			 * arr[0][1][2]=Virat
			 * 
			 * arr[1][0][0]=Rohit
			 * arr[1][0][1]=Gill
			 * arr[1][0][2]=Virat
			 * arr[1][1][0]=Rohit
			 * arr[1][1][1]=Gill
			 * arr[1][1][2]=Virat
			 */
		}
		//Fetching the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside organization no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) //companies
			{
				System.out.println("Inside company no: "+(j+1));

				for(int k=0;k<arr[i][j].length;k++) {

					System.out.println("the name of the Employee no: "+(k+1)+" is = "+arr[i][j][k]);
				}
			}
		}
	}
}
```
---

# Python

### <b>1.Program to reverse the string</b><br>
``` python
s='sachin'
print(s)
print(s[::-1]) #1st way
print(''.join(reversed(s))) #2nd way

#3rd way
n=len(s)-1
data=''
while n>=0:
	data=data+s[n]
	n=n-1

print(data)
```
---
	
### <b> Program to reverse order of words.<br>
input: Learning Python is very Easy<br>
output: Easy very is Python Learning</b>

``` python
s=input('enter the string ')
print(s)
lst=s.split()
print(lst)
lst1=[]
n=len(lst)-1
while n>=0:
    lst1.append(lst[n])
    n=n-1

res=' '.join(lst1)
print(res)
```
---
### <b>Program to reverse internal content of each word.<br>
input: knowledge is power <br>
output:egdelwonk si rewop</b>

``` python
s=input('enter the string ')
lst=s.split()
lst1=[]

n=0
while n<len(lst):
    lst1.append(lst[n][::-1])
    n=n+1

res=' '.join(lst1)
print(res)
```
---

### <b>Write a program to print characters at odd position and even position for the given String?</b></b>
``` python
s=input('enter the string ')
n=0
print('char at even position')
while n<len(s):
    print(s[n],end=',')
    n=n+2
print()

n=1
print('char at odd position')
while n<len(s):
    print(s[n],end=',')
    n=n+2
```

### <b> Program to merge characters of 2 strings into a single string by taking characters</b><br>
``` python
s1=input('enter the s1 ')
s2=input('enter the s2 ')
res=''
i,j=0,0
while i<len(s1) or j<len(s2):
    if i<len(s1):
        res=res+s1[i]
        i+=1
    if j<len(s2):
        res=res+s2[j]
        j+=1

print(res)
```

### <b> Write a program to sort the characters of the string and first alphabet symbols followed by numeric values.<br>
input: B4A1D3<br>
Output: ABD134</b><br>

``` python
s=input('enter some string ')
s1=s2=res=''
for i in s:
    if i.isalpha():
        s1=s1+i
    else:
        s2=s2+i
for i in sorted(s1):
    res=res+i
for i in sorted(s2):
    res=res+i
print(res)
```

### <b> Write a program for the following requirement<br>
input: a4b3c2<br>
output: aaaabbbcc</b>

``` python
s=input('enter some string ')
res=''
for i in s:
    if i.isalpha():
        res=res+i
        data=i
    else:
        res=res+data*(int(i)-1)

print(res)



#another way
-------------
s=input('enter the str')
l=[]
res=""
for i in s:
    l.append(i)
for i in range(0,len(s),2):
    res+=(l[i]*int(l[i+1]))
print(res)
```

