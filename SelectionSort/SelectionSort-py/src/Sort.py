
def  sort(arr:list[int])->None:
    n:int=len(arr)

    for i in range(0,n,1):
        for j in range(i+1,n,1):
            min:int=i
            if arr[j]<arr[min]:
                min=j

            temp:int=arr[i]
            arr[i]=arr[min]
            arr[min]=temp
