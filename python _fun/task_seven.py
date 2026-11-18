sum =0
average = 0
count = 0

for number in range(1,11):
	user_input = int(input("Enter a number : "))
	if user_input % 2== 0:
		count +=1
		sum = sum + user_input
		average = sum/count
		

print("The Sum of the even  Scores are : ", sum)
print("The Average of the even  Scores are : ", average)
