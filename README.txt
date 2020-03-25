## Coding Question Solution ##

Best approach to get moving average of Last N number added is using LinkedList (QUEUE) or ArrayList. 
After carefully reviewing performance I choose ArrayList. 
Because, 
1. LinkedList maintains element data and two pointers for neighbor nodes hence the memory consumption is high compare to ArrayList.
2. ArrayList search is much faster as compared to the LinkedList search operation.
   get(int index) in ArrayList gives the performance of O(1) while LinkedList performance is O(n).

#All the required method is given in interface IMovingAverage,which is type Generic, so we can have different implementation as per requirement.
#MovingAverageService implements given IMovingAverage interface, here I use Double for implementation.
#FindMovingAverage contains main method. Moving average of last N number = windowSize. Provide this number in constructor of MovingAverageService.
#MovingAverageServiceTest contains few basic Junit test cases to make sure everything is working correctly.

#Solution explanation 
We can add numbers to List using addElement() method. At this point check that if List size greater than last N number(which is windowSize) then 
remove first element from sum variable.
Example: Given List=[2.0, 3.0, 5.0] want to find moving average of Last N=3 number so windowSize=3.
when we try to add one more element in list suppose 4.0 then it will subtract first element (2.0) from current sum(10) variable, To maintain windowSize of 3.
Thus it will gives average of last 3 number as 3+5+4/3 = 4.
 
## Design Question Soultion ##
Solution for this question is given in PaytmLabs_DesignSolution.pdf file.  