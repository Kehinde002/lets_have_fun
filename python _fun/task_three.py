sum =0
average = 0
count = 10
for number in range(1,11):
	user_input = int(input("Enter a number : "))
	sum = sum + user_input
	average = sum/count

print("The Sum of the ten Scores are : ", sum)
print("The Average of the ten Scores are : ", average)
