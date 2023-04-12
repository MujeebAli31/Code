#Sum/Average Program
#Your first and last name:Mujeeb Ali
#Your student ID:s1285220

#Build on what you did in the 'List of Names' program
#Instead of entering 10 names, enter 20 numbers (integers)
#Instead of searching for a name in the list
#   Compute the sum of all 20 numbers
#   Compute the average for all 20 numbers

#User interaction-
#Enter a number:
#The sum of the numbers you entered is:
#The average of the numbers you entered is:

#List creation
End=False
Numbers = []
sumint=0
for x in range(0,20):
    Number = int(input("Enter a number:"))
    Numbers.append(Number)
    sumint = sumint + Number
print (Numbers)
Average = ((sumint)/(20))
sumint = str(sumint)
Average=str(Average)
print("Sum:" + (sumint))
print("Average:" + (Average))

        
        
    
    

               



