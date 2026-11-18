def farenheit_conversion(temperature):
	threshold_value= 120
	celcius = (temperature - 32)*5/9 
	farenheit = (temperature * 9/5) + 32
	
	if farenheit < threshold_value:
		print("cold advisory")
	elif farenheit > threshold_value:
		print("Heat alert")
	if celcius < threshold_value:
		print("cold advisory")
	elif celcius > threshold_value:
		print("Heat alert")
		
	print(celcius, " degrees celcius to farenheit is " , farenheit)
	print(farenheit, " farenheit degrees  to celcius is " , celcius)
	

user_input = int(input(" Enter temperature eitheir F or C : " ))

farenheit_value = farenheit_conversion(user_input)
print (farenheit_conversion)

celcius_value = celcius_conversion(user_input)
print(celcius_conversion)

