sum =0
counter = 0
for number in range(1,11):
	user_input = int(input("Enter a number : "))
	counter += 1
	if counter % 2== 0:
		sum = sum + user_input
		

print("The Sum of the even index Scores are : ", sum)
