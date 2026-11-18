sum =0

for number in range(1,11):
	user_input = int(input("Enter a number : "))
	if user_input % 2== 0:
		sum = sum + user_input
		

print("The Sum of the even  Scores are : ", sum)
