Number = int(input("Number to check : "))
add = 0
t_num = Number

#factorial of each number
while t_num > 0:
    fact = 1
    i = 1
    x = t_num % 10

    while i <= x:
        fact = fact * i
        i = i + 1
    print('Factorial of %d = %d' %(x, fact))
    add = add + fact
    t_num = t_num // 10
#upper while ends here ....

print("The add of the Digits Factorials = %d" %add)

if add == Number:
    print("\n%d is a Krishnamurthy Number." %Number)
else:
    print("%d is Not a Krishnamurthy Number." %Number)