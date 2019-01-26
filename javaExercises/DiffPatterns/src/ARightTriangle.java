/*
For Beginner It's Hard to understand pattern problem logic
but it's simple if you master the loop

pattern problem 1:
print Right Triangle Star pattern:
*
**
***
****
*****

Our approach for finding this pattern solution is
We are going to use two loops -one loop for count the line and other for print"*".
yeah,i know its difficult to understand what i just say, no problem i explain this in brief below.(Also I added a flowchart for this problem)

First loop (i=1;i<=5;i++),it is basic syntax for initializing a loop which count upto 5(i.e 1-5),
but here second loop is going to help in printing *'s (j=0;j<i;j++). see we initialize j from 0 and condition is j<i

Now see how this loop works:

for Ist time i=1 and condition is true so it enter in Ist loop,then here is 2nd loop and its start as j=0 and condition is also true here(i.e 0<1),
so it enters into 2nd loop and print one * ,now as for loop work it increments j as j++ and now j's value is 1,but the condition is gone wrong here (i.e 1<1),so
it come out of 2nd loop and then execute nextline function for Ist loop.
output produced here:
*

NOTE: Still we are in Ist loop.

Now the value of increments as i++ and i becomes i=2 further this loop check for condition and it is true so again go in 2nd loop here
j is initialized again from 0 and condition is (0<2) which is true now it prints one *
 Output produced here:
 *
 *
NOw j increments and j now is j=1 still the condition is true(i.e 1<2), so it again print one * in same line
Output produced here:
*
**
now again j value increments,and j becomes j=2 but now condition is false so it come out from loop and print nextline function for 1st loop.
and so on it print the pattern upto i=5 then it come out from 1st loop also.
*/
public class ARightTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();        //nextline func.
        }
    }
}
