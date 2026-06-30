from Sort import quick_sort

arr=[9,8,7,6,5,4,3,2,1]

quick_sort(arr,0,len(arr)-1)

for i in arr:
    print(i,end="")
