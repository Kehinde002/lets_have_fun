sum =0
average = 0


for number in range(1,11):
	user_input = int(input("Enter a number : "))
	if user_input >= 0 and user_input <= 100:
		sum = sum + user_input

		

print("The Sum of the valid  Scores are : ", sum)

