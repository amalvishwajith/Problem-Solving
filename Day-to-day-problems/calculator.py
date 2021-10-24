# this is a program to make a simple calculator using python

def add(x,y): # function to add 2 numbers
    return x+y

def sub(x,y): # function to subtract 2 numbers
    return x-y

def mul(x,y): # function to multiply 2 numbers
    return x*y

def div(x,y): # function to divide 2 numbers
    return x/y

print("Select operation.")
print("1.Add")
print("2.Substract")
print("3.Multiply")
print("4.Divide")

while True:

  choose= input("Enter your choice(1/2/3/4): ")

  if choose in ('1', '2', '3', '4'):
    num1= float(input("Enter the first number: "))
    num2= float(input("Enter the second number: "))

    if choose=='1':
        print(num1, "+", num2, "=", add(num1, num2))

    elif choose == '2':
        print(num1, "-", num2, "=", sub(num1, num2))

    elif choose == '3':
        print(num1, "*", num2, "=", mul(num1, num2))

    elif choose == '4':
        print(num1, "/", num2, "=", div(num1, num2))
        
        # check if user wants another calculation
        # break the while loop if answer is no
        next_calculation = input("Let's do next calculation? (yes/no): ")
        if next_calculation == "no":
          break
    
    else:
        print("Invalid Input")    
