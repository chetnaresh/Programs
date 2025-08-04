n=123456789
temp=""
while n>0:
    num=n%10
    temp+=str(num)
    n=n//10
a=(temp)
for i in range(len(a)):
    if i%2==0:
        print(int(a[i]),end="")