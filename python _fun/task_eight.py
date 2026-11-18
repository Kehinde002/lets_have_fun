sum =0
user_input = int(input("Enter a number : "))
if(user_input <=-1):
	print("You did not enter a valid number")
for number in range(1,11):
    if user_input >= 0 and user_input <= 100 : 
        user_input = int(input("Enter a number : "))
        sum = sum + user_input
    else:
        print("You did not enter a valid number")

		

print("The Sum of the ten Scores are : ", sum)

