from datetime import date

def calculateAge(birthDate):
	today = date.today()
	age = today.year - birthDate.year -
		((today.month, today.day) <
		(birthDate.month, birthDate.day))

	return age
	
# Driver code
print(calculateAge(date(1998, 11, 1)), "years")
