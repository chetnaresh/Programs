n=363
temp=""
while n>0:
    num=n%10
    temp+=str(num)
    n=n//10
a=int(temp)
if a%3==0:
    print("Jackpot")
else:
    print("Nothing")