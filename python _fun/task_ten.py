sum =0
average = 0
count = 0


for number in range(1,11):
	user_input = int(input("Enter a number : "))
	if user_input >= 0 and user_input <= 100:
		count +=1
		sum = sum + user_input
		average = sum/count

		

print("The average of the valid  Scores are : ", average)
