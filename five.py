l=[50,80,60]
l.sort()
j=1
for i in range(len(l)):
    l[i]=j
    j+=1
print(l,j)