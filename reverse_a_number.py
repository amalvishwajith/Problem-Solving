number = 123456789
reversedNum = 0

while number != 0:
    oneDigit = number % 10
    reversedNum = reversedNum * 10 + oneDigit
    number //= 10

print("Reversed output: " + str(reversedNum))